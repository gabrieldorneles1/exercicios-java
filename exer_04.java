package funcoes;

import java.util.Locale;
import java.util.Scanner;

public class exer_04 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		 int numeros, horas;
		double valorhora, salario;
		 
		 numeros = sc.nextInt();
		 horas = sc.nextInt();
		 valorhora = sc.nextDouble();
		 
		 salario = valorhora * horas;
		 
		 System.out.println("NUMBER = " + numeros);
		    System.out.printf("SALARY = U$ %.2f%n", salario);
			
			sc.close();

	}

}
