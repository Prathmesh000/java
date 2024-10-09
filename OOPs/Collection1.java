import java.util.*;
public class Collection1 {
    public static void main(String[] args) {
        
        Collection<Integer> obj = new ArrayList<>();
        obj.add(5);
        obj.add(7); 

        for(int a : obj){
            System.out.println(a);
        }
    }
}
