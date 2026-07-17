
package classesandobjects.Challenge;

public class Book {
   static int totalBooks;

   String title;
   String author;
   long isbn;

   boolean isBorrowed ;

   static {
      totalBooks = 0;
   }

   {
      totalBooks++;
   }

 

    Book(String title, String author, long isbn, boolean isBorrowed ) {
      this.title = title;
      this.author = author;
      this.isbn = isbn;
      this.isBorrowed  = isBorrowed ;
   }

   Book(String title, String author, long isbn) {
      this.title = title;
      this.author = author;
      this.isbn = isbn;

   }

   static int getTotalBooks() {
      return totalBooks;
   }

   public void borrowBook() {
      if (isBorrowed ) {
    System.out.println(title + " is already borrowed.");
      } else {
         this.isBorrowed  = true;
    System.out.println(title + " borrowed successfully.");
      }

   }

public void returnBook() {
    if (isBorrowed) {
        isBorrowed = false;
        System.out.println(title + " returned successfully.");
    } else {
        System.out.println(title + " was not borrowed.");
    }
}

}
