# GameFinder

Este é um projeto em Kotlin que permite aos usuários (Gamers) buscar informações sobre jogos, adicionar descrições personalizadas e gerenciar uma lista de jogos buscados. O projeto integra-se com a API da **CheapShark** para obter dados sobre os jogos.

## Funcionalidades

- **Cadastro de Gamers:** Criação de usuários com validação de nome e e-mail.
- **Busca de Jogos:** Integração com a API da CheapShark para buscar informações sobre jogos a partir de um ID.
- **Gerenciamento de Jogos:** Adicionar, ordenar, filtrar e excluir jogos de uma lista.
- **Validação de Dados:** Validação de e-mail e cálculo de idade com base na data de nascimento.

## Tecnologias Utilizadas

- **Linguagem:** Kotlin
- **API:** CheapShark
- **Bibliotecas:**
    - [Gson](https://github.com/google/gson) - Para manipulação de JSON
- **Ferramentas:**
    - **HttpClient** - Para requisições HTTP.

## Execução do Projeto

1. **Pré-requisitos:**
    - Kotlin instalado.
    - Conexão com a Internet (para chamadas à API).

2. **Como executar:**
    - Clone o repositório.
    - Certifique-se de que todas as dependências estão instaladas (Gson e HttpClient).
    - Compile e execute o arquivo `Main.kt`.

3. **Fluxo Principal:**
    - O programa solicita ao usuário o cadastro de um gamer.
    - Permite buscar jogos informando um ID.
    - Adiciona os jogos buscados à lista do gamer, permitindo filtrar ou excluir posteriormente.
