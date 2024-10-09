public class RotatedSorted {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 1;
        System.out.println(rotated(arr,target));
    }
    static int rotated(int[] arr, int target){
        int pivot = pivot(arr);
        if(pivot == -1){
            return BinarySearch(arr,target,0,arr.length - 1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
        // else {                        //This is what i thought of
        //    int first = BinarySearch(arr,target,0,pivot);
        //    if(first != -1){
        //     return first;
        //    }
        //    return BinarySearch(arr,target,pivot + 1,arr.length - 1);

        // }
        if (target >= arr[0]){
            return BinarySearch(arr,target,0,pivot - 1);
        }
        return BinarySearch(arr,target,pivot + 1,arr.length - 1);
    }

    static int BinarySearch(int[] arr,int target,int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid]<target){
                start = mid + 1;
            }
            else if(arr[mid]>target){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            else if(mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            else if(arr[start] >= arr[mid]){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
