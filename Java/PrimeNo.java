import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no. : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no. : ");
        int b = sc.nextInt();
        for(int i = a;i <= b; i++ ){
            if(PrimeNo(i)){
                System.out.print(i + " ");
            }
        }

    }
    static boolean PrimeNo(int n){
        if(n == 2){
            return true;
        }
        for(int i = 2; i <= n/2 ; i++){
            if(n % i == 0){
                return false;
            }  
        }
        return true;
    }
}
