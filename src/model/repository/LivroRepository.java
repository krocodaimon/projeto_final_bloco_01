package model.repository;

import java.util.List;

public interface LivroRepository {
    void adicionarLivro(Livro livro);
    List<Livro> listarLivros();
}
