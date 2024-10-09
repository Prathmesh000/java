import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. = ");
        int num = sc.nextInt();
        factorial(num);

    }
    static void factorial(int n){
    //     int i = 1;
    //     int ans = 1;
    //     while(i <= n){
    //         ans = i * ans;
    //         i++;
    //     }
    //     System.out.println(ans);
        int ans = n;
        while (n>=2){
            ans = ans * (n-1);
            n--;
        }
        System.out.println(ans);

    }
}
