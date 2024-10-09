public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,7,5,9,7};
        int ans =LinearSearch(arr, 100);
        System.out.println(ans);
        
    }

    static int LinearSearch(int[] arr, int target){          //dusra hi naam leleta yr ,yellow dikh rha
        if(arr.length == 0){
            return -10;
        }

        for ( int i = 0; i < arr.length; i++) {
        int element = arr[i];
            if(element == target){
                return i;                 //return krke ruk jata islea aage nhi gya shyd
                // System.out.println(i);
        }
            
        }
        return -1;
    
    }
}
