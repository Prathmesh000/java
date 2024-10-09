import java.util.*;

interface lambd{
    void display();
}

public class lambda {
    public static void main(String[] args) {

    List<Integer> arr = new ArrayList<>();
    for(int i = 0; i < 5; i++){

        arr.add(i* 2);
    }
     arr.forEach(val -> System.out.println(val));


        lambd a = () -> System.out.println("Helloo");
        a.display();
}
}

