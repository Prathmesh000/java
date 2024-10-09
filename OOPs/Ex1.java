public class Ex1 {
    public static void main(String[] args) {

        Box box1 = new Box();
        Box box2 = new Box(4,4,4);
        Box box3 = new Box(box2);
        
        BoxWeight box4 = new BoxWeight(1,2,3,4);
        box4.y();
        System.out.println(box4.h);
        BoxHeight box5 = new BoxHeight();
        System.out.println(box5.l);
        
    }
}

class Box {
    double h;
    double l;
    double w;

    static void y(){
        System.out.println("cghfcgf");
    }

    Box(){
        this.h = -1;
        this.w = -1;
        this.l = -10;
    }
    Box(double h, double l, double w){

        this.h = h;
        this.l = l;
        this.w = w;
    }
    Box(Box box){
        this.h = box.h;
        this.l = box.l;
        this.w = box.w;
    }
}

class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(double h, double l, double w, double weight){
        super(h, l, w);
        this.weight = weight;

    }
} 
class BoxHeight extends BoxWeight{
    double height;
    BoxHeight(){
        this.height = -1;
    }
    BoxHeight(double h, double l, double w, double weight,double height){
        super(h, l, w, weight);
        this.height = height;
    }
}