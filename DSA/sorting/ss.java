import java.util.Arrays;

public class ss {
    public static void main(String[] args) {
         int[] arr = {9, -90, 89,6,87,43,3,6};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int smallest = i;

            for (int j = i+1; j < arr.length; j++) {
                int temp;
                
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
