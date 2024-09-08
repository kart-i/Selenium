package week3.assignments;

public class oddIndexToUppercase {

	public static void main(String[] args) {
	
		String name = "karthikeyan";
		char[] arr = name.toCharArray();
		char[] newArr = new char[name.length()];
		
		for(int i=0;i<arr.length;i++) {
			if((i%2)!=0) {
				
				char upper = Character.toUpperCase(arr[i]);
				newArr[i] = upper;
			}
			else {
				newArr[i] = arr[i];
			}
		}
		String newName = new String(newArr);
		System.out.println(newName);
		
	}

}
