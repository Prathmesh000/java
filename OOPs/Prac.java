
class Pen{
    String type;
    static int pop;
    int num;

    static void Color(){
        System.out.println(Pen.pop);
    }
    Pen(){
        System.out.println("Constructorrrrrrr");
        pop += 1;
    }
}

public class Prac {
    public static void main(String[] args) {
    
        Pen p1 = new Pen();
      
     
        Pen p2 = new Pen();
       Pen.Color();
       p2.Color();
    }
}
