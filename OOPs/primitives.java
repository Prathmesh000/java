import java.util.Arrays;

public class primitives {
    public static void main(String[] args) {
        
        int a = 10;
        int b = a;
        b += 2;
        System.out.println(b);

        int[] arr = {1,2,3};
        int[] brr = arr;
        brr[0] = 344;
        System.out.println(Arrays.toString(brr));
        brr = new int[5];
        System.out.println(Arrays.toString(brr));
    }
}
