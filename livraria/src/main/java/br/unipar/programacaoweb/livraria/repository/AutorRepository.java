package br.unipar.programacaoweb.livraria.repository;

import br.unipar.programacaoweb.livraria.model.Autor;
import br.unipar.programacaoweb.livraria.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {

    List<Autor> findByNomeContainingIgnoreCase(String nome);

   /* List<Livro> findByNacionalidadeContainingIgnoreCase(String nacionalidade);

    List<Livro> findByNacionalidadeContainingIgnoreCase(String nacionalidade);

    @Query("SELECT t FROM Livro t WHERE t.titulo = :genero AND t.numeroPaginas >= :numeroPaginas")
    List<Livro> findByGeneroNumeroPaginas(@Param("genero") String genero,
                                          @Param("numeroPaginas") int numeroPaginas);*/
}