
import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16},

        };
        int target = 16;
        System.err.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] matrix,int target){
        int row = matrix.length;
        int col = matrix[0].length;
        if(row == 1){
           return BinarySearch(matrix,0,0,col-1,target);
        }
        int rstart = 0;
        int rend = row - 1;
        int cmid = col/2;
        while(rstart < (rend - 1)){
            int mid = rstart + (rend-rstart)/2;
            if(matrix[mid][cmid] == target){
                return new int[]{mid,cmid};
            }
            else if(matrix[mid][cmid] > target){
                rend = mid;
            }
            else{
                rstart = mid;
            }

        }
        if(matrix[rstart][cmid] == target){
            return new int[]{rstart,cmid};
        }
        if(matrix[rstart + 1][cmid] == target){
            return new int[]{rstart,cmid};
        }

        if(matrix[rstart][cmid-1] >= target){
            return BinarySearch(matrix,rstart,0,cmid - 1,target);

        }
        if(matrix[rstart][cmid+1] <= target && target <= matrix[rstart][col-1]){
            return BinarySearch(matrix,rstart,cmid + 1,col-1,target);

        }
        if(matrix[rstart + 1][cmid-1] >= target){
            return BinarySearch(matrix,rstart+1,0,cmid - 1,target);

        }
       else{
            return BinarySearch(matrix,rstart+1,cmid+1,col-1,target);

        }
        
    }

    static int[] BinarySearch(int[][] matrix, int row, int cstart, int cend,int target){
        while(cstart <= cend){
            int mid = cstart + (cend-cstart)/2;
            if(matrix[row][mid] < target){
                cstart = mid+1;
            }
            else if(matrix[row][mid] > target){
                cend = mid - 1;
            }
            else{
                return new int[]{row,mid};
            }
        }
        return new int[]{-1,-1};
    }
}
