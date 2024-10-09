import java.util.Arrays;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,99,100,2,1,0};
        int a = Index(arr);
        System.out.println(a);
    }
    static int Index(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
        if(arr[mid] < arr[mid+1]){
            start = mid + 1;
        }
        else{
            end = mid;
        }
    }
    return start;
    }
}
