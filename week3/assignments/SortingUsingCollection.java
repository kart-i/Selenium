package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
	
		String[] companies = {"Hcl", "Wipro", "Aspire Systems","CTS"};
		String[] companies2 = {"Wipro", "Hcl", "CTS", "Aspire Systems"};
		List<String> list = new ArrayList<String>();
		for(String name:companies) {
			
			list.add(name);
		}
//		Collections.sort(list);
//		Collections.reverse(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		

	}

}
