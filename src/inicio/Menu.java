package inicio;

import controller.LivroController;
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
			System.out.println("1. Cadastrar Livro");
			System.out.println("2. Cadastrar Livro Técnico");
			System.out.println("3. Atualizar Livro");
			System.out.println("4. Listar Livros");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine(); // Limpar buffer

			switch (opcao) {
			case 1:
				System.out.print("Digite o título: ");
				String titulo = scanner.nextLine();
				System.out.print("Digite o autor: ");
				String autor = scanner.nextLine();
				System.out.print("Digite o ano de publicação: ");
				int ano = scanner.nextInt();
				scanner.nextLine();
				Livro livro = new Livro(titulo, autor, ano) {
				};
				controller.cadastrar(livro);
				break;

			case 2:
				System.out.print("Digite o título: ");
				String tituloTecnico = scanner.nextLine();
				System.out.print("Digite o autor: ");
				String autorTecnico = scanner.nextLine();
				System.out.print("Digite o ano de publicação: ");
				int anoTecnico = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Digite a área: ");
				String area = scanner.nextLine();
				LivroTecnico livroTecnico = new LivroTecnico(tituloTecnico, autorTecnico, area, anoTecnico);
				controller.cadastrar(livroTecnico);
				break;

			case 3:
				System.out.println("Lista de Livros:");
				for (int i = 0; i < controller.listarLivros().size(); i++) {
					System.out.println(i + " - " + controller.listarLivros().get(i));
				}
				System.out.print("Escolha o índice do livro para atualizar: ");
				int index = scanner.nextInt();
				scanner.nextLine();
				if (index >= 0 && index < controller.listarLivros().size()) {
					System.out.print("Digite o novo título: ");
					String novoTitulo = scanner.nextLine();
					System.out.print("Digite o novo autor: ");
					String novoAutor = scanner.nextLine();
					System.out.print("Digite o novo ano de publicação: ");
					int novoAno = scanner.nextInt();
					scanner.nextLine();
					Livro novoLivro = new Livro(novoTitulo, novoAutor, novoAno) {
					};
					controller.atualizar(index, novoLivro);
				} else {
					System.out.println("Índice inválido.");
				}
				break;

			case 4:
				System.out.println("\nLista de Livros:");
				for (Livro l : controller.listarLivros()) {
					System.out.println(l.toString());
				}
				break;

			case 0:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opção inválida.");
			}
		} while (opcao != 0);

		scanner.close();
	}
}
