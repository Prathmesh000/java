import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter range: ");
        int a = sc.nextInt();
        System.out.println("ENter range: ");
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if(Palindrome(i)){
                System.out.println(i);
            }
            
        }

    }
    static boolean Palindrome(int a){
        int rem;
        int ans =0;
        int temp = a;
        while(a>0){
            rem = a % 10;
            a /= 10;
            ans = ans + rem*rem*rem;

        }
        if(ans == temp){
            return true;

        }
       return false;
       
    }
}
