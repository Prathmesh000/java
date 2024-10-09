public class CUstomException {
    public static void main(String[] args) {
        int i = 10;
        try{
            if(i < 11){
                // throw new Exception("Less than 11");
                // throw new MyException("Custom Exception!!");
                throw new ArithmeticException("Kya tutul putul kya tutul putul");
            }
        }
            catch(Exception e){
                System.out.println(e);
            }
            
        }
    }
    class MyException extends Exception{
        public MyException(String str){
            super(str);
        }
    }

