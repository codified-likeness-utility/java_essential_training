import org.w3c.dom.ls.LSOutput;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    // The main method must have only one parameter of an array of Strings
    public static void main(String[] args) {
        var item = "Shirt";
        var size = 'M';
        var price = 14.99;
        var color = "Red";

        // Format string that determines where and how arguments will be used
        var template = "Clothing item: %s, size %s, color %s, $%.2f";
        // Format string 'template' is passed in as the 1st arg and the following args are passed
        // in the order that they are specified within the format string above
        var itemString = String.format(template, item, size, color, price);
        System.out.println(itemString);
    }
}



