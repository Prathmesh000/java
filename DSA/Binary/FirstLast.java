import java.util.Arrays;

public class FirstLast {
    public static void main(String[] args) {
        int[] arr = {2,3,4,4,6,8,9};
        int target = 4;
        int[] a = FirstAndLast(arr, target);
        System.out.println(Arrays.toString(a));
    }

    static int[] FirstAndLast(int[] arr, int target){
        int[] ans = {-1,-1};
        ans[0] = search(arr, target, true);
        ans[1] = search(arr, target, false);
        return ans;
       
    }

    static int search (int[] arr, int target, boolean first){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                ans = mid;
                if(first){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
