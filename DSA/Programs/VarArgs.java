import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,5,6,8,7,8);                 //Arguments
        multiple(2, 6, "Aryan","Arsh");
    }
    static void multiple(int a,int b, String...v){    //Variable length argument must be last in list not in betwn(Parameters)
        System.out.println();
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
