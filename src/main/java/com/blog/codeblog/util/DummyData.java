package com.blog.codeblog.util;


import com.blog.codeblog.model.Post;
import com.blog.codeblog.repository.TechBlogRepository;
//import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    TechBlogRepository techBlogRepository;

    //@PostConstruct
    public void savePosts(){

        if(techBlogRepository.count() > 0){
            return;
        }

        List<Post> postList = new ArrayList<>();

        Post post1 = new Post();
        post1.setAutor("Julia Agosti");
        post1.setDataPostagem(LocalDate.now());
        post1.setTitulo("Introdução ao Docker");
        post1.setTexto("""
        <h2>O que é Docker?</h2>

        <p>Docker é uma plataforma para criar, distribuir e executar aplicações em containers.</p>

        <ul>
            <li>Portabilidade</li>
            <li>Facilidade de deploy</li>
            <li>Isolamento de aplicações</li>
        </ul>

        <img src="https://www.docker.com/wp-content/uploads/2022/03/Moby-logo.png" width="250">

        <p>O Docker é amplamente utilizado em projetos modernos de desenvolvimento.</p>
        """);

        Post post2 = new Post();
        post2.setAutor("Julia Agosti");
        post2.setDataPostagem(LocalDate.now());
        post2.setTitulo("Criando APIs com Spring Boot");
        post2.setTexto("""
        <h2>Spring Boot</h2>

        <p>Spring Boot simplifica o desenvolvimento de aplicações Java.</p>

        <pre>
@GetMapping("/usuarios")
public List<Usuario> listar(){
    return repository.findAll();
}
        </pre>

        <p>Com poucas configurações já é possível criar uma API REST completa.</p>
        """);

        Post post3 = new Post();
        post3.setAutor("Julia Agosti");
        post3.setDataPostagem(LocalDate.now());
        post3.setTitulo("PostgreSQL para Iniciantes");
        post3.setTexto("""
        <h2>Banco de Dados PostgreSQL</h2>

        <p>O PostgreSQL é um dos bancos relacionais mais utilizados atualmente.</p>

        <pre>
CREATE TABLE usuario(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100)
);
        </pre>

        <p>Ele oferece segurança, performance e confiabilidade.</p>
        """);

        Post post4 = new Post();
        post4.setAutor("Julia Agosti");
        post4.setDataPostagem(LocalDate.now());
        post4.setTitulo("Android Studio e Desenvolvimento Mobile");
        post4.setTexto("""
        <h2>Desenvolvimento Android</h2>

        <p>O Android Studio é a IDE oficial para desenvolvimento Android.</p>

        <ol>
            <li>Criar projeto</li>
            <li>Desenvolver telas</li>
            <li>Conectar API</li>
            <li>Publicar aplicativo</li>
        </ol>

        <p>É a principal ferramenta para criar aplicativos Android nativos.</p>
        """);

        Post post5 = new Post();
        post5.setAutor("Julia Agosti");
        post5.setDataPostagem(LocalDate.now());
        post5.setTitulo("Projeto TechBlog");
        post5.setTexto("""
        <h2>Sobre este Projeto</h2>

        <p>Este blog foi desenvolvido utilizando:</p>

        <ul>
            <li>Java</li>
            <li>Spring Boot</li>
            <li>PostgreSQL</li>
            <li>Thymeleaf</li>
            <li>Bootstrap</li>
        </ul>

        <p>O objetivo foi praticar o desenvolvimento Full Stack com Java.</p>
        """);

        postList.add(post1);
        postList.add(post2);
        postList.add(post3);
        postList.add(post4);
        postList.add(post5);

        for(Post post : postList){
            techBlogRepository.save(post);
        }
    }
}