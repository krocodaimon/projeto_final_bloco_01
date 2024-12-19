package inicio;

import Controller.LivroController;
import model.repository.Livro;
import model.repository.LivroTecnico;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		LivroController controller = new LivroController();
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\nMenu:");
			System.out.println("1. Adicionar Livro");
			System.out.println("2. Adicionar Livro Técnico");
			System.out.println("3. Listar Livros");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine(); // Limpar o buffer do scanner

			switch (opcao) {
			case 1:
				System.out.print("Digite o título do livro: ");
				String titulo = scanner.nextLine();
				System.out.print("Digite o autor do livro: ");
				String autor = scanner.nextLine();
				Livro livro = new Livro(titulo, autor);
				controller.adicionarLivro(livro);
				break;

			case 2:
				System.out.print("Digite o título do livro técnico: ");
				String tituloTecnico = scanner.nextLine();
				System.out.print("Digite o autor do livro técnico: ");
				String autorTecnico = scanner.nextLine();
				System.out.print("Digite a área do livro técnico: ");
				String area = scanner.nextLine();
				LivroTecnico livroTecnico = new LivroTecnico(tituloTecnico, autorTecnico, area);
				controller.adicionarLivro(livroTecnico);
				break;

			case 3:
				System.out.println("\nLista de Livros:");
				for (Livro l : controller.listarLivros()) {
					System.out.println(l.toString());
				}
				break;

			case 0:
				System.out.println("Saindo do sistema...");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 0);

		scanner.close();
	}
}
