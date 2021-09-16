import org.w3c.dom.ls.LSOutput;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a numeric value: ");
        Scanner input1 = new Scanner(System.in);
        var num1 = input1.nextInt();

        System.out.println("Enter a second numeric value: ");
        Scanner input2 = new Scanner(System.in);
        var num2 = input2.nextInt();
        System.out.println("The answer is " + num1/num2);
    }
}




