package br.unipar.programacaoweb.livraria.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private Integer numeroPaginas;

    private String genero;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    @JsonIgnoreProperties("livros")
    private Autor autor;


}

