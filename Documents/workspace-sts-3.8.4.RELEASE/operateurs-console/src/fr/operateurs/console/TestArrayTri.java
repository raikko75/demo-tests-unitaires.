package fr.operateurs.console;

import java.util.Arrays;

public class TestArrayTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		showTableTri(array);
	}

	private static void showTableTri(int[] array) {
		 Arrays.sort(array);
		for(int temp : array ){
			System.out.println(temp);
		}
	}
	
	

}
