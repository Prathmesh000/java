import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter no.");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int temp = num;
        int ans = 0;

        while( num > 0){
            int rem = num % 10;
            ans = ans * 10 + rem;    //ans ko pehle hi declare krna hoga while loop k bahar nhi to if condition m use nhi kr paunga
            num /= 10;
        }
            if(ans == temp)
                
                System.out.println("Palindrome");


        
       


        }
    }

