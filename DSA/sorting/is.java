import java.util.Arrays;

public class is {
       public static void main(String[] args) {
         int[] arr = {9, -90, 89,6,87,43,3,6};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void Insertion(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > element){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = element;
        }
    }
}
