# CodeBlog
Sistema web desenvolvido utilizando Java, Spring Boot, PostgreSQL, Thymeleaf e Bootstrap.

## Sobre o projeto

Este projeto foi desenvolvido como prática de estudos em Java e Spring Boot, tendo como inspiração os conceitos aprendidos em cursos da Rocketseat sobre desenvolvimento backend.

A partir da ideia inicial, foram realizadas adaptações e implementações próprias para ampliar as funcionalidades da aplicação, transformando o projeto em um blog completo com operações CRUD.

## Funcionalidades

* Listagem de posts
* Visualização de detalhes de um post
* Cadastro de novos posts
* Edição de posts existentes
* Exclusão de posts com confirmação
* Validação de campos obrigatórios
* Dados de demonstração através de DummyData
* Persistência de dados utilizando PostgreSQL

## Tecnologias Utilizadas

* Java
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Thymeleaf
* Bootstrap
* Maven

## Melhorias Implementadas

Além da estrutura inicial utilizada como referência de estudo, foram implementadas melhorias como:

* Redirecionamento automático da página inicial para a listagem de posts.
* Implementação da funcionalidade de edição de posts.
* Implementação da funcionalidade de exclusão de posts.
* Ajustes na estrutura dos Controllers utilizando anotações modernas do Spring.
* Criação de dados de exemplo para facilitar testes e demonstrações.
* Melhorias na navegação entre as páginas.

## Melhorias Implementadas

Este projeto continua em evolução. Na próxima versão, está planejada a implementação de:

* Sistema de autenticação de usuários (login e registro)
* Controle de acesso (admin e usuários comuns)
* Associação de posts a usuários
* Possível área administrativa para gerenciamento do blog
* Melhorias na segurança da aplicação

## Como Executar

1. Clone o repositório.
2. Configure um banco PostgreSQL.
3. Ajuste as configurações do banco no arquivo `application.properties`.
4. Execute a aplicação Spring Boot.
5. Acesse:

http://localhost:8080

## Autor

Júlia Agosti

Projeto desenvolvido para fins de estudo e aprimoramento de conhecimentos em Java, Spring Boot e desenvolvimento web.
