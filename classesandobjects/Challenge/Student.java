package classesandobjects.Challenge;

public class Student {
    public static void main(String[] args) {
        Book s1 = new Book("To Kill a Mockingbird", "Harper Lee", 978006112);
        Book s2 = new Book("To Kill a Mockingbird", "Harper Lee", 978006112);
        Book s3 = new Book("The Hobbit", "J. R. R. Tolkien", 978054);
           
        System.out.println("Total Books: " + Book.getTotalBooks());

        
        s1.borrowBook();
        s3.borrowBook();
        s2.borrowBook();

    }
}
