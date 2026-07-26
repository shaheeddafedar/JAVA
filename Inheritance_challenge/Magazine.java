package Inheritance_challenge;

public class Magazine extends LibraryItem {
    int issueNumber;

    // Constructor
    public Magazine(int itemID, String title, String author, int issueNumber) {
        super(itemID, title, author);
        this.issueNumber = issueNumber;
    }

    public static void main(String[] args) {
        Magazine m = new Magazine(101, "Java Monthly", "ABC", 25);


        System.out.println("Item ID: " + m.getItemID());
        System.out.println("Title: " + m.getTitle());
        System.out.println("Author: " + m.getAuthor());
        System.out.println("Issue Number: " + m.issueNumber);
    }
}