import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         char ch = in.next().trim().charAt(0);  //coz theres nothing like in.nestchar ,charAt function gives first letter
         
         if (ch >= 'a' && ch <= 'z') {
            System.out.println("Small");
         }
        else{
            System.out.println("Capital");
        }

    }
}
