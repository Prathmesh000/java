import java.util.Scanner;

public class Max {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = in.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = in.nextInt();
        System.out.println("Enter 3rd number : ");
        int c = in.nextInt();

        max(a, b, c);
        min(a, b, c);
    }

    static void max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Largest no. is = " + max);

    }

    static void min(int a, int b, int c) {
        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        System.out.println("Minimum is : " + min);
    }
}