import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int n = a.length();
        moveHash(a,n);
    }

    static void moveHash(String str,int n){

        String str1 = "";
        String str2 = "";

        for (int i = 0; i < n; i++) {
            
            if(str.charAt(i) == '#'){
                str1 = str1 + str.charAt(i);
            }
            else{
                str2 = str2 + str.charAt(i);
            }
        }
        String result = str1.concat(str2);
        System.out.println(result);
    }
}

