import java.util.*;
public class Calci{
    public static void main(String[] args){
        Scanner ab = new Scanner(System.in);
        int d;
        do{
             System.out.println("Enter number:");
        double a = ab.nextDouble();
        double b = ab.nextDouble();
        System.out.println(" Select operation:-\nAddition:\nSubtraction:\nMultiplication:\nDivision:");
        int c = ab.nextInt();
        switch(c){
            case 1: System.out.println("Addition=\n");
            System.out.println(a + b);
            break;
            case 2: System.out.println("Subtraction=\n");
            System.out.println( a - b);
            break;
            case 3: System.out.println("Multiplication:\n");
            System.out.println(a * b);
            break;
            case 4: System.out.println("Division\n");
            System.out.println(a / b);
            break;
            default: System.out.println("Select no. between 1-4");
          

        }
        System.out.println("Do u want to continue");
        d = ab.nextInt();
    } while (d == 1);
    
}
}
