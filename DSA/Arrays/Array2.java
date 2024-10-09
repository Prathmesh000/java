import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 12;
        arr[2] = 12;
        arr[3] = 12;
        arr[4] = 12;
        System.out.println(arr[4]);

        //input using for loop
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = in.nextInt();
        // }

        // System.out.println(Arrays.toString(arr));
        
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // for( int num : arr){
        //     System.out.println(num);

        // }
        // System.out.println(arr[7]);
        //array of objects
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));


    }
    
}
