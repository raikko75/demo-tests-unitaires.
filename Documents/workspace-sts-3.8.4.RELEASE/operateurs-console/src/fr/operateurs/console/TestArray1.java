package fr.operateurs.console;

public class TestArray1 {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int i = 0;
		//showTabCroissant(i,array);
		//showTabDecroissant(array);
		//showTabSuperieur(array, i);
		//showTabPaireOnly(array, i);
		//showTabHigherValue(array);
		showTabLowerValue(array);
	}

	private static void showTabLowerValue(int[] array) {
		int lowerValue=0;
		for(int j=0;j< array.length;j++){

			if(array[j] < lowerValue ){
				lowerValue = array[j];	
			}		
		}	
		System.out.println(lowerValue);
	}

	private static void showTabHigherValue(int[] array) {
		int maxValue=0;
		for(int j=0;j< array.length;j++){

			if(array[j] > maxValue ){
				maxValue = array[j];	
			}		
		}	
		System.out.println(maxValue);
	}

	private static void showTabPaireOnly(int[] array, int i) {
		for(int temp : array )
			if(temp %2== 0)
				System.out.println(" indice"+i+": "+ temp); 
	}

	private static void showTabSuperieur(int[] array,int i) {
		for(int temp : array )
			if(temp > 3)
				System.out.println(" indice"+i+": "+ temp); 
			
	}
	public static void showTabCroissant(int i, int[] array){
		
		for(int temp : array )
			System.out.println(" indice"+i+": "+ temp);
	}
	public static void showTabDecroissant (int[] array){
		
		for(int j=array.length-1 ; j >=0 ; j--)
			System.out.println(" indice"+ j +": "+ array[j]);
	}
	
	
}
