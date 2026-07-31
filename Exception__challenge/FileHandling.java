// 88. File Not Found Exception Handling Write a program to read a filename from the user and display its content. The program should handle the situation where the file does not exist.
// Key Points:
// • Use Scanner to read the filename from the user.
// • Use FileReader to read the file content.
// • Implement a try-catch block to handle FileNotFoundException.
// • Display a message informing the user if the file is not found.

package Exception__challenge;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your File name ");
        String fileName = input.next();
        // System.out.println("Current directory: " + System.getProperty("user.dir"));
        try (FileReader reader = new FileReader(fileName)) {
            int read = 0;
            while ((read = reader.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (FileNotFoundException e) {
            System.out.printf("%s File not Found ",fileName);
        } catch (IOException e) {
            System.out.println("execption handling" + e.getMessage());
        }
        input.close();
    }
}
