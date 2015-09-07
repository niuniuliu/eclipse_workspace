package org.nitpro.array;

public class CopyTest {
	public static void bubbleSort(int[] array) {
		boolean isSwap = false;
		for (int j = array.length - 1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					isSwap = true;
				}				
			}
			if(!isSwap){
				break;
			}			
		}
	}
	
	public static void main(String[] args){
		int[] array = {3,5,2,6,1};
		bubbleSort(array);
		
		for(int i = 0;i<array.length;i++){
			System.out.println(array[i]);
		}
		int[] array1 = new int[5];
		
		
		System.arraycopy(array, 0, array1, 1, 3);
		
		for(int i = 0;i<array.length;i++){
			System.out.println(array1[i]);
		}
	}
}
