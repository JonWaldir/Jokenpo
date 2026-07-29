package application;

import java.util.Locale;
import java.util.Scanner;

import utili.convert;


public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("What is the dollar price? ");
		double priceDolar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dolar = sc.nextDouble();
		
		double result = convert.dollarToReal(priceDolar, dolar);
		System.out.printf("amout to be paid in reais:  %.2f%n" , result );
		
		sc.close();
	}

}
