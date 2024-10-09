public class ThrowsExcep {
    public static void main(String[] args) {
        
        int i = 9;
        int j = 0;

        try{
            System.out.println("Hello");
            divide(i, j);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally");
        }
    }

    static int divide(int i, int j) throws ArithmeticException{         //throws exception whic is handle by main's catch
        if(j == 0){
            throw new ArithmeticException("kyu tutul putul");
        }
        else {
            return i/j;
        }
    }
}

