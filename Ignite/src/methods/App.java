package methods;

public class App {

	public static void main(String[] args) {
	
		Book book1=new Book("Harry Potter","JK Rowling",500,"English");
		Book book2=new Book("The 4 Hour Workweek","Tim Ferries",300,"English");
		
		System.out.println(book1.author);
		System.out.println(book1.title);
		System.out.println(book1.pages);
		System.out.println(book1.language);
	
				 
	}

}
