package ExercicosEstruturaCondicional;

import java.util.Scanner;

public class Excercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if (numero >=0){
		System.out.println("N�o negativo");
		}else{
			System.out.println("Negativo");
		}
		
		sc.close();
	}
	
}
