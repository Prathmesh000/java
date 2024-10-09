import java.util.Arrays;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},
                     {15,25,35,45},
                     {28,29,37,49},
                     {33,34,38,50}
};
        int target = 37;
        System.out.println(Arrays.toString(Search(arr,target)));
    }
    static int[] Search(int[][] arr,int target){
        int i = 0;
        int j = arr.length - 1;
        while(i < arr.length && j >= 0){
            if(arr[i][j] == target){
                return new int[] {i,j};
            }
            else if(arr[i][j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }
}
