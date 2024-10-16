import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {9, -90, 89,6,87,43,3,6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){

        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at last respective index
            for (int j = 1; j < arr.length - i ; j++) {
                //swap if item is smaller than previous one
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if did not swap for a paticular pass, it means array is sorted, hence break
            if(!swapped){
                break;
            }
        }
    }
}
