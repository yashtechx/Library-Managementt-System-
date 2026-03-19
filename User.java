package library;

public class User {
    public int id;
    public String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

//javac library/User.java library/Book.java MainApp.java
//java MainApp