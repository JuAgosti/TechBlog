# TechBlog

Sistema web desenvolvido utilizando Java, Spring Boot, PostgreSQL, Spring Security, JWT, Thymeleaf e Bootstrap.

## Sobre o projeto

Este projeto foi desenvolvido como prática de estudos em Java e Spring Boot, tendo como base conceitos de cursos da Rocketseat e adaptações próprias.

A aplicação evoluiu de um CRUD simples para um sistema com autenticação e controle de acesso baseado em usuários.

## Funcionalidades

* Sistema de autenticação com login e registro
* Autenticação baseada em JWT (JSON Web Token)
* Controle de sessão stateless
* Listagem de posts
* Visualização de detalhes de um post
* Cadastro de novos posts
* Edição de posts existentes
* Exclusão de posts com confirmação
* Associação de posts a usuários autenticados
* Validação de campos obrigatórios
* Persistência de dados com PostgreSQL

## Segurança (Spring Security)

* Autenticação via JWT
* Filtro de segurança customizado (`OncePerRequestFilter`)
* Usuário autenticado armazenado no `SecurityContext`
* Proteção de rotas da aplicação
* Controle de acesso baseado em login

## Modelagem de Dados

* Usuário possui login, senha criptografada (BCrypt) e role (USER/ADMIN)
* Cada post está associado a um usuário (relacionamento ManyToOne)
* Posts carregam o autor automaticamente via usuário autenticado

## Tecnologias Utilizadas

* Java 17
* Spring Boot
* Spring Security
* JWT (Auth0)
* Spring Data JPA
* PostgreSQL
* Thymeleaf
* Bootstrap
* Maven

## Melhorias Implementadas

* Implementação de autenticação com JWT
* Criação de filtro de segurança personalizado
* Associação de posts com usuário logado
* Ajustes na estrutura dos Controllers
* Proteção das rotas da aplicação
* Evolução do CRUD para sistema autenticado

## 🔮 Próximas melhorias

* Controle de acesso por perfil (ADMIN / USER)
* Permitir que apenas o dono do post possa editar/excluir
* Painel administrativo
* Melhorias na UI/UX do sistema
* API REST separada do frontend

## Como Executar

1. Clone o repositório
2. Configure um banco PostgreSQL
3. Ajuste `application.properties`
4. Execute a aplicação Spring Boot
5. Acesse:

http://localhost:8080

## 👩‍💻 Autora

Júlia Agosti

Projeto desenvolvido para fins de estudo e evolução em desenvolvimento backend com Java e Spring Boot.