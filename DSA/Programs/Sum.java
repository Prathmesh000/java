import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        // sum();
        // sum();
        // sum();
        // sum();
        // sum();
        // int ans = sum2();              //ye n niche waali line zaroori
        // System.out.println(ans);
        int ans = sum3(45, 56);
        System.out.println(ans);

    }
    // pass value of no. when calling method in main
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int a = sc.nextInt();
        System.out.println("Enter");
        int b = sc.nextInt();
        int sum = a + b;
        return sum;
        // iske niche ka kn hoga
       
    }
    // static void sum(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter");
    //     int a = sc.nextInt();
    //     System.out.println("Enter");
    //     int b = sc.nextInt();
    //     int sum = a + b;
    //     System.out.println("Adddition= " + sum );
    // }
}