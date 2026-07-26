// 80. Start with a base class LibraryItem that includes common attributes like itemID, title, and author, and methods like checkout() and returnItem(). Create subclasses such as Book, Magazine, and DVD, each inheriting from LibraryItem. Add unique attributes to each subclass, like ISBN for Book, issueNumber for 
// Magazine, and duration for DVD.

package Inheritance_challenge;

public class LibraryItem {
    int itemID;
    String title;
    String author;

    public void checkout(){
        System.out.printf("this %d item has been checkout"+itemID);

    }

    public void returnItem(){
        System.out.printf("The %d has been returned succefully ");

    }

    public class Book{
        String ISBN;   
    }

    public class Magazine{
        int issueNumber;
    }

    public class DVD{
        double duration;
    }
}
