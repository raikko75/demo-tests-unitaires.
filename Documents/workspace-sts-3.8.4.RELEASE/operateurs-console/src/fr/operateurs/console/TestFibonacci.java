package fr.operateurs.console;

import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {

		int value = AnswerUser();
		fibonnaci(value);
	}


	private static int AnswerUser() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez un nombre");
		int value = sc.nextInt();
		return value;
	}

}
