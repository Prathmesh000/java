public class Shadowing {
    static int x = 100;
    public static void main(String[] args) {
        
        System.out.println(x);
        int x = 0;
        // int x;
        System.out.println(x);  //This will print 0 not 100
        // System.out.println(x);   Scope will begin when value is initialized
        // x = 0;
        fun();
        System.out.println(x);
    }
    static void fun(){
        System.out.println(x);
    }
}
