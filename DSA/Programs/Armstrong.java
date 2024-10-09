import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isArmstrong(n);
        System.out.println(ans);

        for(int i = 100; i < 1000; i++){           //All armstrong betwn 100 - 999
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
        
    }
    static boolean isArmstrong(int a){
        int original = a;
        int ans = 0;
        while(a > 0){
           int rem = a % 10 ;
           a /= 10;
           ans = ans + rem*rem*rem;

        }
        if(ans == original){        //or return sum == original
            return true;
        }
        return false;
    }
}
