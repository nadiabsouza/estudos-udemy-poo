package aula24;

public class Main {
	
	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products: ");
		System.out.println("Computer, which price is $ "+ price1);
		System.out.println("Office desk, which price is $ "+ price2);
		System.out.println();
		System.out.printf( "Record: %s years old, code $ %s and %s ",age, code, gender );
		System.out.println();
		System.out.println("Measure with eight decimal places:  " + measure);
		System.out.printf("Rouded (three decimal places): %.2f measure%n", measure);
		System.out.printf("Us decimal point:  %.2f measure%n", measure);
	}

}
