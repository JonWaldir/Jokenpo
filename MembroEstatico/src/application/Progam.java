package application;

import java.util.Locale;
import java.util.Scanner;

import util.calculator;

public class Progam {
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		
		double radius = sc.nextDouble();
		
		double c = calculator.circunference(radius);
		
		double v = calculator.volume(radius);
		
		System.out.printf("Circuference: %.2f%n", c);
		System.out.printf("volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", calculator.PI);
		sc.close();

	}
	
	
}
