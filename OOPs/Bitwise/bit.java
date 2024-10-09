import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to double:");
        int a = sc.nextInt();
        System.err.println(a<<1);
        System.out.println(1&a);
    }
}
