Video 2 - API Simples com Java 21 e Spring Boot

Descrição:
Este projeto implementa uma API REST simples utilizando **Java 21** e **Spring Boot**. A API oferece suporte para testar requisições **GET** e **POST**, ideal para iniciantes que estão aprendendo sobre APIs REST.

O projeto é baseado no vídeo:
"Curso de Spring para Iniciantes | Tutorial Completo de Java Spring" - **Fernanda Kipper | Dev**
Link: https://www.youtube.com/watch?v=YY_hf0FOIcU

-----------------------------------------------------

Tecnologias Utilizadas:
- **Java 21**: Linguagem de Programação
- **Spring Boot**: Framework para criação de APIs
- **Maven**: Gerenciador de dependências

-----------------------------------------------------

Endpoints Disponíveis:

1. **GET** /Hello_World
   Descrição: Retorna uma saudação simples com o nome "Danilo".

2. **POST** /Hello_World/{id}
   Descrição: Recebe um JSON com `id`, `nome`, e `email`, e retorna uma mensagem com os dados fornecidos.

-----------------------------------------------------

Como Testar a API:

1. **Clone o Repositório**:

Execute o comando abaixo para clonar o repositório:
git clone https://github.com/Danilo-c0de/AtividadeV2.git
cd AtividadeV2

2. **Teste a Requisição GET**:

- Acesse o endpoint `/Hello_World` com uma requisição GET.
- A resposta será uma saudação simples, como:
  "Hello, Danilo"

3. **Teste a Requisição POST**:

- Envie uma requisição POST para o endpoint `/Hello_World/{id}` com um JSON como este:
  {
    "id": 1,
    "nome": "Danilo",
    "email": "danilo@example.com"
  }
- A resposta será:
  "Hello, Danilo. Your ID is 1"

-----------------------------------------------------

Como Rodar o Projeto:

1. **Configure o ambiente**:
   - Certifique-se de ter o **Java 21** e o **Maven** instalados.

2. **Execute o comando** para rodar a aplicação:
   mvn spring-boot:run

-----------------------------------------------------

Testando com Postman ou Insomnia:

- Para testar os endpoints, use ferramentas como **Postman** ou **Insomnia**.
- Realize a requisição GET em `/Hello_World` para ver a resposta.
- Realize a requisição POST em `/Hello_World/{id}` com os dados necessários.

-----------------------------------------------------

Próximos Passos:
Este projeto serve como uma introdução ao desenvolvimento de APIs com Spring Boot. Você pode expandir esse projeto adicionando mais endpoints, persistência de dados, autenticação e muito mais!

-----------------------------------------------------

Autor:
Danilo de Jesus Campos
GitHub: https://github.com/Danilo-c0de
