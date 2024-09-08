package week3.assignments;

public class ReverseOddWords {

	public static void main(String[] args) {
		
		String input = "I am a  software  tester ";
		String[] arr1 = input.trim().split("\\s+");
		
		StringBuilder sb = new StringBuilder(arr1[0]);
		
		for(int i=1;i<arr1.length;i++) {
			
			if((i%2)!=0){
				
				//reverse
				StringBuilder sb2 = new StringBuilder(arr1[i]).reverse();
			
				//append
				sb.append(" "+sb2);
				
			}else{
				sb.append(" "+arr1[i]);
			}
			
		}
		String output =sb.toString();
		System.out.println(output);
					
	}
		
		
}


