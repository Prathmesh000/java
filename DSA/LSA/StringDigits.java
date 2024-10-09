public class StringDigits {
    public static void main(String[] args) {
        
        int[] nums = {2,34,555,12345};
        
        digits(nums); 
    }

    static void digits(int[] nums){
        for(int n : nums){
            String words = n + "";
            System.out.println(words.length());
        }
    }
}
