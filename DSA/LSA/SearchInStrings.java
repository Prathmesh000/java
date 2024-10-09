import java.util.Arrays;
public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Aryan";
        char target = 'r';   //" " diya to error aata ki cant convert str to char
        System.out.println(search(name, target)); 
        System.out.println(Arrays.toString(name.toCharArray()));  //str ka array bnata h .toCHarArray()

    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        // for(char ch : str.toCharArray()){   for each loop
        //     if(ch == target){
        //         return true;
        //     }
        // }
         for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
         }
         return false;
    }
    
}
