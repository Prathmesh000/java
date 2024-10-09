import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);        //Class ka naam arraylist likha tha to lafda hua
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);

        System.out.println(list.contains(45)); 
        list.set(0, 45678);

        System.out.println(list);
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
            
        }
        System.out.println(list);
    }
    
}
