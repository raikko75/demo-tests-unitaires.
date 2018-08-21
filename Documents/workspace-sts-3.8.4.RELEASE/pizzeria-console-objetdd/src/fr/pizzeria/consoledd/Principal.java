package fr.pizzeria.consoledd;

import java.io.Console;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import fr.pizzeria.model.PizzaDD;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		List<PizzaDD> Pizza = new ArrayList<>();		
		int value;
		do{

			System.out.println("***********PIZZA*************");
			System.out.println("1-Lister des pizza");
			System.out.println("2-Ajouter une pizza");
			System.out.println("3-Mise à jour d' une pizza");
			System.out.println("4-Supprimer une pizza");
			System.out.println("5-Quitter");
			System.out.println("Faite votre choix");

			value = sc.nextInt();
			switch (value)
			{
			case 1:
				for (PizzaDD pizzaDD : Pizza) {
					System.out.println(pizzaDD);
				}
				break;
			case 2:
				break;

			}
		}while(value != 5);


	}

}
