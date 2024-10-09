import java.util.Arrays;
public class insert {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int num = 3;
        int pos = 3;
        for (int i = arr.length - 1; i > pos - 1 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[pos-1] = num;;
        System.out.println(Arrays.toString(arr));
    }
}
