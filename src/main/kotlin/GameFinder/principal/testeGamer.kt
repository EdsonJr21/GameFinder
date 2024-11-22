package GameFinder.principal
import GameFinder.modelo.Gamer
fun main() {
    val gamer1 = Gamer("Jhon", "jhon@email.com")
    println(gamer1)

    val gamer2 = Gamer(
        "Jhon",
        "jhon@email.com",
        "19/10/1995",
        "jhonOsvald")

    println(gamer2)

    gamer1.let {
        it.dataNascimento = "18/09/2000"
        it.usuario = "jhonosvald14"

    }.also {
        println(gamer1.idInterno)
    }

    println(gamer1)
    gamer1.usuario = "jhon"
    println(gamer1)
}