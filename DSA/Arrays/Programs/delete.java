import java.util.Arrays;

public class delete {
    public static void main(String[] args) {
        int[] arr = {1,58,9,9,7};
        int element = 58;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                for(int j = i; j<arr.length - 1; j++){
                arr[j] = arr[j+1];
                }
        
            }
        }
        System.out.println(Arrays.toString(arr));
        }
    
}
