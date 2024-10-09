import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {45,5,6,8},
            {5,68,69},
            {56,78},
            {5},
        };
        int target = 78;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    
    static int[] search(int [][] arr, int n){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == n) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
