package fr.operateurs.console;

import java.util.Scanner;

public class OperateursApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valueNb1,valueNb2;
		System.out.println("Veuillez entre un nombre");
		valueNb1 = sc.nextDouble();
		System.out.println("Veuillez entre un autre nombre");
		valueNb2 = sc.nextDouble();
		
		System.out.println( "addition :" +valueNb1 + valueNb2 );
		System.out.println( "soustraction :" + (valueNb1 - valueNb2 ));
		System.out.println( "addition :" +(valueNb1* valueNb2) );
		System.out.println( "addition :" +(valueNb1 / valueNb2) );
		System.out.println( "addition :" +(valueNb1 % valueNb2) );
		
	}

}
