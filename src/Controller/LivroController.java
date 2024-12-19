package Controller;

import java.util.ArrayList;
import java.util.List;

import model.repository.Livro;
import model.repository.LivroRepository;

public class LivroController implements LivroRepository {
    private List<Livro> livros = new ArrayList<>();

    @Override
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro);
    }

    @Override
    public List<Livro> listarLivros() {
        return livros;
    }

    public Livro buscarLivro(String titulo) throws Exception {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        throw new Exception("Livro não encontrado: " + titulo);
    }
}
