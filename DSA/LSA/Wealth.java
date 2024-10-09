public class Wealth{
    public static void main(String[] args) {
        int[][] arr = {{2,3,4},
                   {5,7,1},
                   {9,1,5}
    };

       System.out.println(MaxWealth(arr));
    }

    static int MaxWealth(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}