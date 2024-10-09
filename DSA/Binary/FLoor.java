public class FLoor {
        public static void main(String[] args) {
            int[] arr = {2,3,5,7,9,11,15,17,99};
            int target = 4;
            int a = Floor(arr,target);
            System.out.println(a);
    
        }
        static int Floor(int[] arr, int target){
            int start = 0;
            int end = arr.length - 1;
            
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
            return arr[end];
        }
    }
    

