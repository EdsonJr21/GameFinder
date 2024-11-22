import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

fun String.transformarEmIdade(): Int? {
    val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    return try {
        val dataNascimento = LocalDate.parse(this, formatter)

        if (dataNascimento.isAfter(LocalDate.now())) {
            println("Data de nascimento não pode estar no futuro :)")
            null
        } else {
            Period.between(dataNascimento, LocalDate.now()).years
        }
    } catch (e: DateTimeParseException) {
        println("Formato de data inválido. Use o formato dd/MM/yyyy.")
        null
    } catch (e: Exception) {
        println("Erro ao processar a idade: ${e.message}")
        null
    }
}
