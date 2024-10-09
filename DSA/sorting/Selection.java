import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
         int[] arr = {9, -90, 89,6,87,43,3,6};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                int temp;
                if(arr[j] < arr[smallest]){
                    temp = arr[j];
                    arr[j] = arr[smallest];
                    arr[smallest] = temp;
                }
            }
        }
    }
}
