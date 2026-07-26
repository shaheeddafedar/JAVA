// 80. Start with a base class LibraryItem that includes common attributes like itemID, title, and author, and methods like checkout() and returnItem(). Create subclasses such as Book, Magazine, and DVD, each inheriting from LibraryItem. Add unique attributes to each subclass, like ISBN for Book, issueNumber for 
// Magazine, and duration for DVD.

package Inheritance_challenge;

public class LibraryItem {
   private int itemID;
    private String title;
    private String author;

    public void checkout(){
        System.out.printf("this %d item has been checkout",itemID);

    }

    public void returnItem(){
        System.out.printf("The %d has been returned succefully ",itemID);
    }

    public LibraryItem(int itemID, String title, String author) {
        this.itemID = itemID;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "LibraryItem [itemID=" + itemID + ", title=" + title + ", author=" + author + "]";
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
