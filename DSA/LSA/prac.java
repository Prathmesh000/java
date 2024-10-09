import java.util.Arrays;

public class prac {
    public static void main(String[] args) {

        String name = "Aryan";
        char target =  'y';

        System.out.println(search(name,target)); 
        System.out.println(Arrays.toString(name.toCharArray()));  

    }
   static boolean search(String name, char ch){
    if(name.length()==0){

        return false;
    }

    for (int i = 0; i < name.length(); i++) {
        
        if(ch == name.charAt(i)){
            return true;
        }
    }
    return false;

    }

}
