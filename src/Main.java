import org.w3c.dom.ls.LSOutput;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] months = {
                "January",
                "February",
                "March",
                "April",
                "may",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };

        // Iterative loop
//        for (int i = 0; i < months.length; i++) {
//            System.out.println(months[i]);
//        }

        // forEach loop
//        for (String month : months) {
//            System.out.println(month);
//        }

        // While loop
//        var whileCounter = 0;
//        while (whileCounter < months.length) {
//            System.out.println(months[whileCounter]);
//            whileCounter++;
//        }

        // do loop
        var doCounter = 0;
        do {
            System.out.println(months[doCounter]);
            doCounter++;
        } while (doCounter < months.length);
    }
}




