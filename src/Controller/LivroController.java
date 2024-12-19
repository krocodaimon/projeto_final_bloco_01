package controller;

import model.repository.Livro;
import model.repository.LivroRepository;

import java.util.ArrayList;
import java.util.List;

public class LivroController implements LivroRepository {
	private List<Livro> livros = new ArrayList<>();

	@Override
	public void cadastrar(Livro livro) {
		livros.add(livro);
		System.out.println("Livro cadastrado com sucesso!");
	}

	@Override
	public void atualizar(int index, Livro livro) {
		if (index >= 0 && index < livros.size()) {
			livros.set(index, livro);
			System.out.println("Livro atualizado com sucesso!");
		} else {
			System.out.println("Índice inválido.");
		}
	}

	@Override
	public List<Livro> listarLivros() {
		return livros;
	}
}
