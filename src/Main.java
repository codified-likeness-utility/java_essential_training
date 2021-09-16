import org.w3c.dom.ls.LSOutput;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        var scanner = new Scanner(System.in);
//        System.out.println("Enter a number between 1-12: ");
//        var monthNumber = scanner.nextInt();

        var now = LocalDateTime.now();
        var monthNumber = now.getMonthValue();

        // Declared message variable before codeblock so that it is accessible outside of the codeblock
        String message;
        if (monthNumber <= 3) {
            message = "That's in Quarter 1!";
        } else if (monthNumber > 3 && monthNumber <= 6) {
            message = "That's in Quarter 2!";
        } else if (monthNumber > 6 && monthNumber <= 9) {
            message = "That's in Quarter 3!";
        } else {
            message = "That's in the final Quarter!";
        }
        System.out.println(message);
    }
}




