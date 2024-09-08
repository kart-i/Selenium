package week3.assignments;

public class JavaConnection implements DataBaseConnection {

	public void connect() {
		
		System.out.println("Database is connected");
		
		
	}
	public void executeUpdate() {
			
		System.out.println("Database is updated");
			
	}
	
	public void disconnect() {
		
		System.out.println("Database is disconnected");
	}

	public static void main(String[] args) {
		
		JavaConnection JC = new JavaConnection();
		JC.connect();
		JC.executeUpdate();
		JC.disconnect();
		
	}
	
	

}
