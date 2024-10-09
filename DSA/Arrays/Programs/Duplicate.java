public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,5,8,5,9,1};
        duplicate(arr);

        }
        static void duplicate(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i] == arr[j]){
                    System.out.println("Duplicate is: "+ arr[i]);
                    }
                }
            }
        }
}
