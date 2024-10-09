import java.util.Arrays;
public class arrayPassing {
    public static void main(String[] args) {
        int[] nums = {56,90,89,80};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    private static void change(int[] arr) {
        arr[0] = 1000;
        
    }
}
