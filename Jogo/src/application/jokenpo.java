package application;

import java.util.Locale;
import java.util.Scanner;

import util.jogo;

public class jokenpo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		jogo jok = new jogo();
		System.out.println("Bem vindo ao jokenpo ");
		int op = 0 ;
		int jogada;
		while (op != 9) {
			System.out.println("Digite uma op");
			System.out.println("1-Jogar");
			System.out.println("2-Placar ");
			System.out.println("9-Sair");
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Jogue 1 - pedra ,2 -Papel, 3- tesoura");
				jogada = sc.nextInt();
				jok.Resultado(jogada);
				
				break;
			case 2: 
				System.out.println("VOCE " + jok.voce + " vs " + jok.maquina + " Maquina");
				
				break;
			case 9:
				System.out.println("Tchau");
				break;
			default:
				System.out.println("invalido");
			}
			
		}
		sc.close();
	}

}
