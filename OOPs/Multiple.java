public class Multiple {
    public static void main(String[] args) {
        Box2 obj = new Box2(5,6, 7, 8, 9);
        Box2 obj2 = new Box2();
        System.out.println(obj2.w);
    }
    int l;
    int b;
    int h;

    Multiple(){
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    Multiple(int a,int b, int c){
        this.l = a;
        this.b = b;
        this.h = c;
    }
}

class Box extends Multiple{
    int w;
    Box(){
        super();
        this.w = -1;
    }

    Box(int l,int b, int h,int weight){

        super(l,b,h);
        this.w = weight;
    }
}

class Box2 extends Box{
    int s;
    Box2(){
        super();
        this.s = -1;
    }
    Box2(int l, int b, int h, int w, int size){
        super(l,b,h,w);
        this.s = size;
    }
}


