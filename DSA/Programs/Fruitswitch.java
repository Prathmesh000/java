import java.util.Scanner;

public class Fruitswitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Fruit = input.next();

        switch (Fruit) {
            case "Mango":                             // string humesha apostrophe m dhyan dena
                System.out.println("I like Mangoes");
                break;

            case "Apple":
                System.out.println("I like apples");
                break;

            case "Orange":
                 System.out.println("I like Oranges");
                 break;

            default:
             System.out.println("Pasand Kharab h");
        }

    }
}
