import java.util.*;
public class Marks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b;
        do{
        System.out.println("Enter Marks:");
        int a = sc.nextInt();
        if(a >= 90){
        System.out.println("This is Good");
        }
        else if(89 >= a && a>= 60){
        System.out.println("This is also Good");
        }
        else if(59 >= a && a>= 0){
        System.out.println("This is Good as well");
        }
        System.out.println("Enter 1 or 0:");
        b = sc.nextInt();
    }
     while(b == 1);
}
    }

   
    
