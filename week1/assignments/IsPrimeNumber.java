package week1.assignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int n = 10;
		boolean x = false;
		for (int i = 1; i <(n-1); i++) {
			if((n%(n-i)) == 0) {
				x = true;
				System.out.println("Not Prime");
				break;
			}
		}
		if(!x) {
			System.out.println("Prime");
		}
	}
}


