package week1.assignments;

import java.util.Arrays;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=9;
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			if(i<2){
			array[i] = i;
			}else {
				array[i] = array[i-2]+array[i-1];
			}
		}
		System.out.print(Arrays.toString(array));

	}

}
