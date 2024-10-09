import java.util.Scanner;

public class ColNotFixed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
            {2,3,4},
            {8,9},
            {1,3,4,5,6,7}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();
        }

    }
}
