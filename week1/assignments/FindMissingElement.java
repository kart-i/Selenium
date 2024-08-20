package week1.assignments;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] array = {4,3,2,6,7,5,10,9,8,0,1,12};
		int max = array[0];
		int sum = array[0];
		for(int i=1;i<array.length;i++) {
			 sum = sum+array[i];
			if(array[i]>max) {
				max = array[i];
			}
		}
		int missingNumber = (max*(max+1)/2)-sum;	
		System.out.println(missingNumber);
	
	}

}
