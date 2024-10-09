import java.util.*;
public class Menu {
    public static void main(String args[]){
        System.out.println("Enter a number:-");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Select operation:- \n1.Factorial\n2.Test Arsmstrong\n3.Test Palindrome\n4.Test Prime\n5.Fibonacci series");
        int b =sc.nextInt();
        switch(b){
            case 1: 
            long factorial = 1;
            for(int i = 1; i <= a; ++i)
            {
                // factorial = factorial * i;
                factorial *= i;
            }
            System.out.printf("Factorial of %d = %d", a, factorial);
            break;
            case 2:
            int originalNumber, remainder, result = 0;

            originalNumber = a;
    
            while (originalNumber != 0)
            {
                remainder = originalNumber % 10;
                result += Math.pow(remainder, 3);
                originalNumber /= 10;
            }
    
            if(result == a)
                System.out.println(a + " is an Armstrong number.");
            else
                System.out.println(a + " is not an Armstrong number.");
                break;
            case 3:
            int reversedNum = 0, Remainder;
    
            // store the number to originalNum
            int originalNum = a;
            
            // get the reverse of originalNum
            // store it in variable
            while (a != 0) {
              Remainder = a % 10;
              reversedNum = reversedNum * 10 + Remainder;
              a /= 10;
            }
            
            // check if reversedNum and originalNum are equal
            if (originalNum == reversedNum) {
              System.out.println(originalNum + " is Palindrome.");
            }
            else {
              System.out.println(originalNum + " is not Palindrome.");
            }
            break;
            case 4:
            int i,m=0,flag=0;        
            m=a/2;      
            if(a==0||a==1){  
             System.out.println(a+" is not prime number");      
            }else{  
             for(i=2;i<=m;i++){      
              if(a%i==0){      
               System.out.println(a+" is not prime number");      
               flag=1;      
               break;      
              }      
             }      
             if(flag==0)  { System.out.println(a+" is prime number"); }  
            }
            break;
            case 5:
            int firstTerm = 0, secondTerm = 1;
            System.out.println("Fibonacci Series till " + a + " terms:");
        
            for (int j = 1; j <= a; ++j) {
              System.out.print(firstTerm + ", ");
        
              // compute the next term
              int nextTerm = firstTerm + secondTerm;
              firstTerm = secondTerm;
              secondTerm = nextTerm;
            }
            break;
            default:
            System.out.println("Enter a valid number.");


        }
    }
    
}
