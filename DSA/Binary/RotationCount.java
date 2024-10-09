public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(Rotation(arr));
    }
    static int Rotation(int[] arr){
        int pivot = pivot(arr);
        int n = pivot+1;
        return n;

    }
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            while(start <= end){
                if(mid < end && arr[mid] > arr[mid+1]){
                    return mid;
                }
                if(mid>start && arr[mid] < arr[mid-1]){
                    return mid - 1;
                }
                if(arr[start] < arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
