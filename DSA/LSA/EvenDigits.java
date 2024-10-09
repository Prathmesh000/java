public class EvenDigits {
    public static void main(String[] args) {
        
        int[] nums = {1,20,345,-4567,14567};
        
       System.out.println(findNum(nums)); 
    }

    static int findNum(int[] nums){
         int count = 0;

        for(int n: nums){
            if(even(n)){
                count ++;
            }
        }
        return count;
    }

    static boolean even(int n){
        int num = digits(n);

        // if(num%2 == 0){
        //     return true;
        // }
        // return false;
        return num % 2 ==0;
    }

    static int digits(int n){
        if(n < 0){
            n = n * -1;
        }
        int count = 0;
        while(n > 0){
            count ++;
            n = n/10;
        }
        return count;
    }


}
