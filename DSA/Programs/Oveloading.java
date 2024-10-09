public class Oveloading {
    public static void main(String[] args) {
        fun(7,9);
        fun("Aryan");
    }
    static void fun(int a, int b){
        System.out.println(a + b);

    }
    static void fun(String a){
        System.out.println(a);

    }
}   
