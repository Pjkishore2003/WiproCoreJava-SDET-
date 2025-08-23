package pack4;
class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book issued: " + title);
        } else {
            System.out.println("Book is already issued: " + title);
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("Book was not issued: " + title);
        }
    }
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}
	public class Library {
	    public static void main(String[] args) {
	        Book b1 = new Book("maths", "kishore", "2345678");
	        Book b2 = new Book("physics", "Pj", "34567889");
	        b1.displayInfo();
	        b2.displayInfo();
	        b1.issueBook();   
	        b1.issueBook();   
	        b2.issueBook();   
	        b2.returnBook();  
	        b2.returnBook();  
	        b1.displayInfo();
	        b2.displayInfo();
	    }
	}
	
	
	
