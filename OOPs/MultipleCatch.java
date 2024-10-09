public class MultipleCatch {
    public static void main(String[] args) {
        
    
    int[] arr = new int[4];

    try{
        for(int i=0; i <= arr.length; i++){
            arr[i] = i+1;
        }
    }
    // catch(Exception e){    //nhi likh skte kyuki ye sbko catch krlega, niche waalo k paas kn jayega

    // }
    catch(ArithmeticException e){
        System.out.println(e);
    }
    catch(ArrayIndexOutOfBoundsException a){
        System.out.println(a);
    }
    catch(Exception e){
        System.out.println(e);
    }
    finally{
        System.out.println("BYE!");
    }
}
}
