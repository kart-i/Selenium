package week2.assignments;

public class LibraryManagement {
	
	public static void main(String[] args) {
	
		Library libraryFunction = new Library();
		System.out.println(libraryFunction.addBook("The windup bird chronicle"));
		System.out.println(libraryFunction.issueBook());
	}

}
