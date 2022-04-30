package ExercicosEntradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int numeroFuncionario, numeroHoras;
		double valorHora, salario;
		
		numeroFuncionario = sc.nextInt();
		numeroHoras = sc.nextInt();
		valorHora = sc.nextDouble();
		
	    salario = numeroHoras * valorHora;
	    
	    System.out.println("Number : " + numeroFuncionario);
	    System.out.printf("Salary: U$ %.2f\n", salario);
		
		sc.close();
		
	}

}
