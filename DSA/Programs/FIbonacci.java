import java.util.Scanner;

public class FIbonacci {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();  
        int a = 0;
        int b = 1;
        int count = 2;  //coz 0 and 1 are 1st two elements

        while (count <= n){
            int temp = b; 
            b = a + b ;
            a = temp;
            count ++;

        }
        System.out.println(b);
      
    }
}
