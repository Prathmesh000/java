public class SearchMountain {
    public static void main(String[] args){
        int[] arr = {1,4,6,7,8,9,15,90,100,120,3,2,0};
        int target = 20;
        System.out.println(Search(arr,target));
    }
    static int Search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid +1]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        int peak = start;
        int a = Binary(arr,target,0,peak);
        if(a != -1){
            return a;
        }
        else{
            int b = Binary(arr,target,peak+1,arr.length);
            return b;
        }

    }
    static int Binary(int[] arr,int target,int start,int end){
        boolean isAgn = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end-start)/2;
        if(isAgn){
            if(arr[mid]<target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                return arr[mid];
            }
        } 
        else{
            if(arr[mid] > target){
                start = mid + 1;
            }
            else if(arr[mid] < target){
                end = mid - 1;
            }
            else{
                return arr[mid];
            }
        }
    }
    return -1;
    }
}