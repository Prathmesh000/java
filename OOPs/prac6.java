import java.util.*;

public class prac6 {
    public static void main(String[] args) {
        
        Collection obj1 = new ArrayList();
        obj1.add(79);
        obj1.add("Aryannn");
        obj1.remove(79);
        
        // Iterator i = obj1.iterator();
        // i.next();
        // System.out.println(i.next());
        for(Object i : obj1){
            System.out.println(i);
        }

        List<Integer> obj2 = new ArrayList<>();
        obj2.add(0, 89);
        obj2.add(1, 8966);
        obj2.add(2, 8);
        // obj2.remove(1);
        Collections.sort(obj2);
        for(Integer i : obj2){
            System.out.println(i);
        }
        System.out.println(Collections.max(obj2));

    }
}
