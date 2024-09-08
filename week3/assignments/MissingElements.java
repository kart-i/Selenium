package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElements {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,10,6,8};
		List<Integer> list = new ArrayList<Integer>();
		for(int num:array) {
			list.add(num);
		
		}
		Collections.sort(list);
		for(int i=0;i<list.size()-1;i++) {
			
			if (list.get(i) != list.get(i+1)-1) {
				
				System.out.println(list.get(i)+1);
				break;
				
			}
			
		}

	}

}
