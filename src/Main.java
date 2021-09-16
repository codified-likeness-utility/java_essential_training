import org.w3c.dom.ls.LSOutput;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var now = LocalDateTime.now();
        var monthNumber = now.getMonthValue();

        switch (monthNumber) {
            case 1:
                System.out.println("The month is January!");
            case 2:
                System.out.println("The month is February!");
            case 3:
                System.out.println("The month is March!");
                break;
            case 4:
                System.out.println("The month is April!");
                break;
            case 5:
                System.out.println("The month is May!");
                break;
            case 6:
                System.out.println("The month is June!");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Hot summer's lead to beautiful fall leaves!");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("It's Wintertime!!");
                break;
            default:
                System.out.println("You chose another month...");

        }
    }
}




