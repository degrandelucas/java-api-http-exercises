# Projeto de Estudo - Consumo de APIs com Java

Este projeto demonstra como consumir APIs públicas utilizando a linguagem Java. As APIs escolhidas para este exemplo são:
- **Google Books API:** Para buscar informações sobre livros.
- **CoinGecko API:** Para obter a cotação de criptomoedas.
- **TheMealDB API:** Para pesquisar receitas de pratos.

O objetivo é explorar o uso do **HttpClient**, **HttpRequest** e **HttpResponse**, além de aplicar o tratamento de entradas de usuários e manipulação de URLs.

---

## Funcionalidades Principais

1. **Busca de Livros (Google Books API):**
    - O usuário pode buscar informações de livros ao digitar o nome do livro.
    - O programa utiliza a API do Google Books para retornar os dados do livro solicitado.

2. **Cotação de Criptomoedas (CoinGecko API):**
    - O usuário pode consultar a cotação de uma criptomoeda específica (ex.: Bitcoin, Ethereum).
    - O programa retorna o valor em dólares da criptomoeda consultada.

3. **Pesquisa de Receitas (TheMealDB API):**
    - O usuário pode pesquisar pratos ao digitar o nome da receita.
    - O programa retorna informações detalhadas sobre o prato, incluindo ingredientes e instruções.

---

## Estrutura do Código

### Classes

- **`App`**
    - Classe principal do projeto, responsável por:
        - Capturar as entradas do usuário.
        - Montar URLs para chamadas às APIs.
        - Consumir as APIs utilizando o **HttpClient**.
        - Exibir as respostas no console.

### APIs Utilizadas

1. **Google Books API**  
   Endpoint: https://www.googleapis.com/books/v1/volumes?q={nome_do_livro}

2. **CoinGecko API**  
   Endpoint: https://api.coingecko.com/api/v3/simple/price?ids={criptomoeda}&vs_currencies=usd

3. **TheMealDB API**  
   Endpoint: https://themealdb.com/api/json/v1/1/search.php?s={nome_do_prato}

---

## Como Executar o Projeto

1. **Clone o repositório.**

2. **Configure o ambiente Java.**
- Certifique-se de ter o **Java 11 ou superior** instalado.

3. **Compile e execute o código.**
- Compile o arquivo `App.java`:
  ```bash
  javac App.java
  ```
- Execute o programa:
  ```bash
  java App
  ```

4. **Interaja com o programa.**
- Digite o nome de um livro, criptomoeda ou prato conforme solicitado no console.

---

## Tecnologias Utilizadas

- **Java 11 ou superior:** Linguagem utilizada para o desenvolvimento.
- **HttpClient:** Para realizar requisições HTTP.
- **Scanner:** Para captura de entradas do usuário.
- **APIs públicas:** Google Books API, CoinGecko API e TheMealDB API.

---

## Autor
Lucas Degrande
