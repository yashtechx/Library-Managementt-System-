import library.User;
import library.Book;

public class MainApp {
    public static void main(String[] args) {

        User u = new User(1, "Yash");
        Book b = new Book(101, "Java Programming", "James Gosling");

        System.out.println("User ID: " + u.id);
        System.out.println("Name: " + u.name);
        System.out.println("Book ID: " + b.bookId);
        System.out.println("Book Name: " + b.title);
        System.out.println("Author: " + b.author);

        System.out.println("Book Issued Successfully");
        System.out.println("Return in 7 days");
    }
}

//   javac library/User.java library/Book.java MainApp.java
//   java MainApp