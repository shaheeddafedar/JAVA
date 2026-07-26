package Inheritance_challenge;

public class DVD extends LibraryItem {
     double duration;
         public DVD(int itemID, String title, String author, double duration) {
        super(itemID, title, author);
        this.duration = duration;
    }
}
