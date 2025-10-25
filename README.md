# Library-Spring

### Sistema de Biblioteca – Spring Boot

Este projeto foi desenvolvido com fins de aprendizagem para a disciplina Desenvolvimento de Sistema Corporativo, com o objetivo de criar um Sistema de Gerenciamento de Biblioteca utilizando Spring Boot, JPA/Hibernate e banco de dados H2 em memória.

O sistema permite o gerenciamento de livros, autores, categorias, usuários e empréstimos, além de consultas específicas, como listar livros disponíveis, buscar livros por categoria ou autor, e verificar empréstimos ativos ou atrasados.

---

### Tecnologias Utilizadas 

- Java 21
- Spring Boot
- Spring Data JPA / Hibernate
- Banco de dados H2 (em memória)
- Maven

---

### Funcionalidades

- Gerenciamento de Livros, Autores, Categorias e Usuários
- Cadastro e controle de empréstimos
- Consultas e buscas de livros disponíveis
- Consulta de usuários por nome (busca parcial)
- Listagem de empréstimos ativos ou atrasados
- Contagem de livros por categoria

---

### Endpoints da API

- GET ```/books/available``` – Listar todos os livros disponíveis
- GET ```/books/category/{name}``` – Listar livros por categoria
- GET ```/books/author/{name}``` – Listar livros por autor
- GET ```/users/search?name=``` – Buscar usuários por nome
- GET ```/categories/count-books``` – Contar livros por categoria

---

### Banco de Dados H2  

O projeto utiliza **H2**, um banco de dados em memória, para armazenar dados temporariamente enquanto a aplicação está em execução.

- **Acessar o console H2:** ```http://localhost:8080/h2-console```
- **Configuração (application.properties):**
```
spring.datasource.url=jdbc:h2:mem:librarydb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=create
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```
---
### Observações Importantes

- O banco H2 é em memória, então todos os dados desaparecem ao encerrar a aplicação.
- Todos os endpoints podem ser testados via Postman, Insomnia ou qualquer cliente HTTP.
- Pode ser usado para aprendizado, demonstração ou testes de APIs REST com Spring Boot.

