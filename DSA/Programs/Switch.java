import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String b  = sc.next();

    switch (a) {
        case 1:
            System.out.println("Roll 1");
            break;
        case 2:
            System.out.println("Roll 2");
            break;
        case 3:
            switch (b) {
                case "Aryan":
                System.out.println("Hey Aryan");
                    break;
                case "Arsh":
                System.out.println("Hey Arshh");
                    break;
                default:
                System.out.println("Invalid name");
                    break;
            }
            break;
    
        default:
        System.out.println("Invalid no.");
            break;
    }
    
}
}
