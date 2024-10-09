public class SearchInRange {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8};
        int target = 4;
        int ans = LinearSearch(arr,4,1,6);
        System.out.println(ans);

    }

    static int LinearSearch(int[] arr, int target ,int start, int end){          
        if(arr.length == 0){
            return -10;
        }

        for ( int i = start; i <= end; i++) {
        int element = arr[i];
            if(element == target){
                return i;                
               
        }
            
        }
        return -1;
    
    }
    
}
