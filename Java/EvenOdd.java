import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        // EvenorOdd(num);
        String ans = EvenorOdd(num);
        System.out.println(ans);
    }
    static String EvenorOdd(int n){
        String ans;
        if(n % 2 == 0){
            // System.out.println("Even");
            ans = "Even"; 
        }
        else{
            // System.out.println("Odd");
            ans = "Odd";
        }
        return ans;

    }
}
