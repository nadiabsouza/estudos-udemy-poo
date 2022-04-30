package ExercicosEntradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo1, codigo2, numeroPeca1, numeroPeca2;
		double valorCodigo1, valorCodigo2, resultado;

		codigo1 = sc.nextInt();
		codigo2 = sc.nextInt();
		numeroPeca1 = sc.nextInt();
		numeroPeca2 = sc.nextInt();

		valorCodigo1 = sc.nextDouble();
		valorCodigo2 = sc.nextDouble();

		resultado = valorCodigo1 * numeroPeca1 + valorCodigo2 * numeroPeca2;

		System.out.println("Valor a pagar = R$ " + resultado);

		sc.close();
	}

}
