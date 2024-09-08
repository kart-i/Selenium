package week3.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		int [] array1= {3,2,11,4,6,7,2};
		int [] array2= {1,2,8,4,9,7};
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		
		for(int num : array1) {
			
			list1.add(num);	
			
		}
		for(int num:array2) {
			
			list2.add(num);
		}
		
		List<Integer> intersectionList = new ArrayList<>(list1);
		intersectionList.retainAll(list2);
		System.out.println(intersectionList);

	}

}
