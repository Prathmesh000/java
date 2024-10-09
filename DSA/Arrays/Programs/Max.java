public class Max {
    public static void main(String[] args) {
        int[] arr = {1,5,8,97,10};
        max(arr);
        // int max = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        // }
        // System.out.println(max);
        
        
        
    }
    static void max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
