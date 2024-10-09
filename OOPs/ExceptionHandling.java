public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 6;
        int j = 0, k = 9;
        try{
        k = i/j;
        System.out.println(k);
        }
        catch(ArithmeticException ex){
            System.out.println(ex);
        }
        System.out.println(k);
        
    }
}
