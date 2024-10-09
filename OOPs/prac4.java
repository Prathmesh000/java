import java.util.Arrays;

public class prac4 {
    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = {4,5,6,7,8,9,0,3};
        a = b;
        System.out.println(Arrays.toString(a));
        a[3] = 999;
        System.out.println(Arrays.toString(b));
    }
}
