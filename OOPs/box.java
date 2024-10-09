public class box {
    public static void main(String[] args) {

        
        Boxes b1 = new Boxes(1,2,3);
        
        System.out.println(b1.breadth);
        NewBoxes b2 = new NewBoxes(8,5,6,11);
        System.out.println(b2.weight);

        
    }
}
class Boxes{

    int height;
    int breadth;
    int length;

    Boxes(){
        this.height = -1;
        this.breadth = -1;
        this.length = -1;
    }
    Boxes(int l,int b, int h){
        this.length = l;
        this.breadth = b;
        this.height = h;
    }
}

class NewBoxes extends Boxes{
    double weight;
    NewBoxes(){
        this.weight = -1;
    }
    NewBoxes(int l,int b,int h,int w){
        super(l,b,h);
        this.weight = w;
    }
}
