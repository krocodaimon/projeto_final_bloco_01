package inicio;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		boolean running = true;

		while (running) {
			System.out.println("\n=== MENU PRINCIPAL ===");
			System.out.println("1. Cadastrar Livro");
			System.out.println("2. Listar Livros");
			System.out.println("3. Sair");
			System.out.print("Escolha uma opção: ");

			int opcao = leia.nextInt();
			leia.nextLine(); // Limpar buffer

			switch (opcao) {
			case 1:
				System.out.print("Digite o título do livro: ");
				String titulo = leia.nextLine();
				System.out.println("Livro cadastrado: " + titulo);
				break;
			case 2:
				System.out.println("Funcionalidade para listar livros (em construção).");
				break;
			case 3:
				System.out.println("Saindo...");
				running = false;
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}

	}
}
