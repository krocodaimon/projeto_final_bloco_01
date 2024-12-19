package model.repository;

import java.util.List;

public interface LivroRepository {
    void cadastrar(Livro livro);
    void atualizar(int index, Livro livro); 
    List<Livro> listarLivros();
}
