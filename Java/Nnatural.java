import java.util.Scanner;

public class Nnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter no.: ");
        int n = sc.nextInt();
        sum(n);

    }
    static void sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            
        }
        System.out.println(sum);
    }
}
