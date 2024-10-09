import java.util.Arrays;
import java.util.Scanner;
public class multidimensional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int[][] arr  //declare = new int[3][3]; //initialize
        
        // int[][] arr = {
            //     {9,56,56},
            //     {9,56,56},
            //     {9,56,56}
            
            // };
            int[][] arr = new int[3][3];
            System.out.println(arr.length);  //gives no. of rows

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
                
            }
            
        }

        // for (int row = 0; row < arr.length; row++) {              //output
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col] + " ");
                
        //     }
        //     System.out.println();
            
        // }


        // for (int row = 0; row < arr.length; row++) {         //output
        //     System.out.println(Arrays.toString(arr[row]));
        
        // }

        // for(int[] ele : arr){             //output
        //     System.out.println(Arrays.toString(ele));
        // }

    }
    
}
