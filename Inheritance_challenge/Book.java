package Inheritance_challenge;

public class Book extends LibraryItem {
     String ISBN; 
              public Book(int itemID, String title, String author, String ISBN) {
        super(itemID, title, author);
        this.ISBN = ISBN;
    }  
    
}
