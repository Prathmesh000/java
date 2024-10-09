public class swap {
    public static void main(String[] args) {
        int a =90;
        int b = 70;
       swap(a , b);

        System.out.println(a +" "+ b);

        
    }
    static void swap(int a ,int b){

        int temp;
        temp = a;
        a = b;
        b = temp;
        
    }

}
