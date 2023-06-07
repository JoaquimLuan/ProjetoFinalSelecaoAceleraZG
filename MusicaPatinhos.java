package acelera;

import java.util.Scanner;

public class MusicaPatinhos {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de patinhos: \n");
        int patinhos = scanner.nextInt(); 
        scanner.nextLine(); 
        
        System.out.println("---------- Musica Patinhos ----------\n");


		System.out.println();


		inicioDoDesaparecimentoDePatinhos(patinhos);

		buscaDosPatinhos(patinhos);

		scanner.close();
	}

	private static void inicioDoDesaparecimentoDePatinhos(int patinhos) {
		for (int i = patinhos; i > 0; i--) {
			System.out.println(i + (i == 1 ? " patinho foi passear" : " patinhos foram passear"));
			System.out.println("Além das montanhas");
			System.out.println("Para brincar");
			System.out.println("A mamãe gritou: Quá, quá, quá, quá");

			sumiramTodosPatinhos(i);
		}
	}

	private static void sumiramTodosPatinhos(int i) {
		if (i - 1 == 0) {
			System.out.println("Mas nenhum patinho voltou de lá\n");
		} else {
			System.out.println("Mas só " + (i - 1) + (i - 1 == 1 ? " patinho voltou de la\n" : " patinhos voltaram de lá\n"));
		}
	}

	private static void buscaDosPatinhos(int patinhos) {
		System.out.println("A mamãe patinha foi procurar");
		System.out.println("Além das montanhas");
		System.out.println("Na beira do mar");
		System.out.println("A mamãe gritou: Quá, quá, quá, quá");
		retornoDosPatinhos(patinhos);
	}

	private static void retornoDosPatinhos(int patinhos) {
		if (patinhos == 1) {
			System.out.println("E " + patinhos + " patinho voltou de lá");
		} else {
			System.out.println("E os " + patinhos + " patinhos voltaram de lá");
		}
	}
}

