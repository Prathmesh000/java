import java.util.Scanner;
public class Eligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter age ");
        int age = sc.nextInt();
        eligible(age);
    }

    static void eligible(int n){
        if (n>18){

            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible");
        }

    }
}
