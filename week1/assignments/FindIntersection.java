package week1.assignments;

import java.util.HashSet;
import java.util.Set;

public class FindIntersection {
	public static void main(String[] args) {
		int[] array1 = {3,2,1,4,5,7,8};
		int[] array2 = {1,2,5,4,6,8};
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		for(int i=0;i<array1.length;i++) { // add to set1
			set1.add(array1[i]);	
		}
		for(int j=0;j<array2.length;j++) { // add to set2
			set2.add(array2[j]);
		}
		Set<Integer> intersection = new HashSet<Integer>(set1); //creates copy of set1
		intersection.retainAll(set2); // retain the intersected values in the *intersection* set
		
		System.out.println(intersection);
		
	}	
}
