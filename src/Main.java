import model.ClothingItem;
import utilities.CalcHelper;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var item = new ClothingItem("Shirt", "M", 19.99, 3);

        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance(Locale.US);
        var output = String.format("Your %s order will cost %s", item.getType(), formatter.format(totalPrice));

        System.out.println(output);
    }

}




