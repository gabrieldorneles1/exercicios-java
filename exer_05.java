package funcoes;

import java.util.Locale;
import java.util.Scanner;

public class exer_05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner Sc = new Scanner (System.in);
				
		int cod1, cod2, qt1, qt2;
		double preco1, preco2, total;
		
		cod1 = Sc.nextInt();
		qt1 = Sc.nextInt();
		preco1 = Sc.nextDouble();
		
		cod2 = Sc.nextInt();
		qt2 = Sc.nextInt();
		preco2 = Sc.nextDouble();
		
		total = preco1 * qt1 + preco2 * qt2;
		
		System.out.printf("Valor a ser pago R$ %f%n", total);
		
		Sc.close();

	}

}
