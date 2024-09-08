package week3.assignments;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String sentence = "We learn We basics as part of java sessions in java week1";
		
		//1. convert to array with space 
	    String[] wordsArray = sentence.trim().split("\\s+");
	    
	    int count = 0;
		for(int i=0;i<(wordsArray.length)-2;i++) {
			
			for(int j=i+1;j<(wordsArray.length)-1;j++) {
				
				if(wordsArray[i].equals(wordsArray[j])) {
					
					wordsArray[i]=" ";
					wordsArray[j]=" ";
					count++;	
				}
				
				
			}	
		 }
		
		StringBuilder newSentence = new StringBuilder();
		if(count>0) {
			
			for(String value:wordsArray) {
				
				if(value.equals(" ")) {
					newSentence.append(value);
				}else {
				
					newSentence.append(" "+value);
				}	
			}
			String newString = newSentence.toString();
			System.out.println(newString);
		}
			

	 }

}
