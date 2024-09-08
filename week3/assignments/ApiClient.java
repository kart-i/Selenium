package week3.assignments;

public class ApiClient {
	
	
	public void sendRequest(String endPoint){
		
		System.out.println(endPoint+" request is sent");
		
		
	}
	public void sendRequest(String endPoint,String requestBody,Boolean requestStatus) {
		
		System.out.println(endPoint+" "+requestBody+" "+requestStatus+" request is sent");
	}
	
	public static void main(String[] args) {
		
		ApiClient api = new ApiClient();
		api.sendRequest("String");
		api.sendRequest("newendpoint","body",true);
		
		
	}

}
