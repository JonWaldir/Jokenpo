package application;

import java.util.Locale;
import java.util.Scanner;

import gasosa.Carro;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter fuel price per liter: ");
		double price = sc.nextDouble();
		System.out.print("Enter distance in km : ");
		
		double distance = sc.nextDouble();
		double result = Carro.valueInReais(price, distance);
		System.out.printf("Amount to be paid in reais: %.2f%n" , result);
		
		sc.close();
	}

}
