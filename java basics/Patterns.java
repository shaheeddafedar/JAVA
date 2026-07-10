public class Patterns {
    public static void main(String[] args) {
        // firstPattern();
        secondPattern ();

    }

    public static void firstPattern (){
        int rows=0;
      while (rows<5) { 
          System.out.print("*");
          int i =0;
          while (i<rows) { 
              System.out.print(" *");
              i++;
          }
          System.out.println();
          rows++;
      }
    }


    public static void secondPattern ()
    {
        int rows=5;
      while (rows>0) { 
          System.out.print("*");
          int i =0;
          while (i<rows) { 
              System.out.print(" *");
              i++;
          }
          System.out.println();
          rows--;
      }
    }
}
