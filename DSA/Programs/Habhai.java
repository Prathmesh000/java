import java.util.Scanner;
public class Habhai {
    public static void main(String[] args) {
        System.out.println("Enter No.");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int a = 0;
        int b = 1;

        for(int i = 2; i < num ; i++ ){

            int next = a + b;
            a = b;
            b = next;
            System.out.println(b);
            
        }

        // System.out.println(b);
    }
}
