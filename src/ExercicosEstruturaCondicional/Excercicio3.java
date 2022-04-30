package ExercicosEstruturaCondicional;

import java.util.Scanner;

public class Excercicio3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int valorA = sc.nextInt();
		int valorB = sc.nextInt();
		
		if (valorA % valorB == 0 || valorB % valorA == 0){
		   System.out.println("São múltiplos");
		}else {
		System.out.println("Não são múltiplos");
		
		sc.close();
	}
		
}
	
}
