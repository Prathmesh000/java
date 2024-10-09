
public class BinarySearch {
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7,8,99};
            int target = 999;
            int a = BinarySearch(arr, target);
            System.out.println(a);
        }
        
        static int BinarySearch(int[] arr, int target){
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
                    return mid;
                }
            }
            return Integer.MIN_VALUE;
        }
    }
    
    
    

