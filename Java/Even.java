import java.util.*;
public class Even{
    public static void main(String args[]){
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i<=a ; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
    
}