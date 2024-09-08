package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int[] array = {3,2,11,4,6,7,12};
		List <Integer> list = new ArrayList<Integer>();
		for(int num : array) {
			list.add(num);	
		}
		Collections.sort(list); // sort in ascending order
		System.out.println(list);
		int pos = list.size()-2;
		System.out.println(list.get(pos)); //get using index
		
	}

}
