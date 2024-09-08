package week2.assignments;

public class Library {
	
	

	public String addBook(String bookTitle) {
		
		System.out.println("Book Added Successfully");
		return bookTitle;
		
	};
	
	public String issueBook() {
		
		return "Book Issued Successfully";
	};

	public static void main(String[] args) {
		
		Library libraryFunction = new Library();
		System.out.println(libraryFunction.addBook("Anna Karenina"));
		System.out.println(libraryFunction.issueBook());
	}
		
		

}
