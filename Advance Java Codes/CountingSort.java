import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String[] array = input.nextLine().split(" ");
		int[] sequence = new int[array.length];
		for(int i =0; i < array.length ;i++) {
			sequence[i] = Integer.parseInt(array[i]);
		}
		
		int larger = input.nextInt();
		int lower = input.nextInt();
		
		countingNegativo(sequence, larger, lower);
		
	}
	
	
	public static void countingNegativo(int[] array, int larger, int lower) {
		int[] counting = new int[(larger - lower) + 1];
		int distancia = lower * -1;
		
		for(int j = 0; j < array.length; j++) {
			counting[array[j] + distancia]++;
		}
		
		for(int k = 1; k < counting.length; k++) {
			counting[k] += counting[k-1];
		}
		
		int[] resultado = new int[array.length];
		for(int i = array.length-1; i > -1; i--) {
			resultado[counting[array[i] + distancia] -1] = array[i];
			counting[array[i] +distancia]--;
		}
		System.out.println(Arrays.toString(resultado));
	}

}