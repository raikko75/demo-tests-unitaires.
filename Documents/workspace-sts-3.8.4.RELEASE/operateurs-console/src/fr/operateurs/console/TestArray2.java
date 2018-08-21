package fr.operateurs.console;

public class TestArray2 {
	public static void main (String [] args){
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int indice = 15;
		//showMediumValue(array);
		//showIndiceWithValue(array,indice);
		showNumberWithSameValue(array);
	}

	private static void showNumberWithSameValue(int[] array) {
		int value;
		for(int i=0;i< array.length;i++){
			
			for(int j=1;j< array.length;j++){
				
				if(array[i]==array[j]){
					value = array[j];
					System.err.println(value);
				}
			}
		}	
	}

	private static void showIndiceWithValue(int[] array, int indice) {
		int i =0;
		for(int temp : array ){
			if(temp == indice){
			 System.out.println("lindice 15 est :"+ i);
			}
			i++;
		}
	}

	private static void showMediumValue(int[] array) {
		int mediumValue=0 ,i=0;
		for(int temp : array ){
			mediumValue += temp;
			i++;
		}
		System.out.println(mediumValue / i);
	}
}
