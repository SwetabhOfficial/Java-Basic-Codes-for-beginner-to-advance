import java.util.Arrays;

public class MergeSort {
	
	public static void mergeSort(int[] array, int start, int end) {
		
		if( start < end) {
			
			
			int half = (start + end)/2;
			mergeSort(array, start, half);
			mergeSort(array, half+1, end);
			merge(array, start, half, end);
		}
	}
	
	
	
	
	public static void merge(int[] array, int start, int half, int end) {
		int[] aux = new int[array.length];
		
		for(int q = start; q <= end; q++) {
			aux[q] = array[q];
		}
		
		int i = start;
		int j = half + 1;
		int k = start;
		
		while(i <= half && j <= end) {
			if(aux[i] < aux[j]) {
				array[k] = aux[i];
				i++;
			} else {
				array[k] = aux[j];
				j++;
			}
			k++;
		}
		
		while(i <= half) {
			array[k] = aux[i];
			i++;
			k++;
		}
		while( j <= end) {
			array[k] = array[j];
			j++;
			k++;
		}
		
	}
	
	public static void main(String[] args) {
		int[] array = {50, 40, 35, 30, 20,10};
		mergeSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}

}