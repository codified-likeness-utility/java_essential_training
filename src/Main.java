import jdk.jshell.execution.JdiDefaultExecutionControl;
import org.w3c.dom.ls.LSOutput;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            var i1 = getInput(sc, "Enter value 1: ");
            var i2 = getInput(sc, "Enter value 2: ");

            System.out.println("Select an mathematical operation (+ - * /): ");
            Scanner op = new Scanner(System.in);
            var operation = op.next();

            if (operation.equals("+")) {
                System.out.println("The answer is: " + (i1 + i2));
            } else if (operation.equals("-")) {
                System.out.println("The answer is: " + (i1 - i2));
            } else if (operation.equals("*")) {
                System.out.println("The answer is: " + (i1 * i2));
            } else {
                System.out.println("The answer is: " + (i1 / i2));
            }

        } catch (InputMismatchException e) {
            System.out.println("Could not format as a a number...");
        }



    }

    private static int getInput(Scanner sc, String prompt) {
        System.out.println(prompt);
        return sc.nextInt();
    }

}




