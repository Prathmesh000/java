public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,9,18,26,28,49,50,56,78,90,145};
        int target = 18;
        int n = search(arr, target);
        System.out.println(n);

    }
    static int search (int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end-start + 1)*2;
            start = newStart;

        }
        return BinarySearch(arr, target, start, end);
    }
    static int BinarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return arr[mid];
            }

        }
        return -1;
    }
}
