import java.util.Scanner;
public class Ughhh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l.b and u.b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        func(a, b);
    }
    static void func(int a, int b){
        
        for (int i = a; i <= b; i++) {
            int flag = 1;
            for(int j = 2; j * j <= i;j++){
                if(i % j == 0){
                flag = 0;
                break;
                }
            }
            if(flag == 1){
            System.out.print(i + " ");
          
        }
            
        }

    }
}
