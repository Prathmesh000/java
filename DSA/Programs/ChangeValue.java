import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] a = {0,56,79,23,56};
        chenge(a);
        System.out.println(Arrays.toString(a));
        
    }
    static void chenge(int[] Args){
        Args[0]= 89; //modify kiya h
    }
}
