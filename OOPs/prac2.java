public class prac2 {
    public static void main(String[] args) {
        System.out.println(args[0]);
        Shapes obj1 = new Shapes();
        Circle obj3 = new Circle();
        Shapes obj2 = new Square();
        Square obj4 = new Square();
        obj2.area();
        System.out.println(obj4.a);
        System.out.println(obj1 instanceof Shapes);
    }
}

class Shapes{
    int a = 10;
    void area(){
        System.out.println("This is shapesss");
    }
}
class Circle extends Shapes{
    @Override
    void area(){
        System.out.println("This is Circle");
    }
}
class Square extends Shapes{
    int a = 90;
    @Override
    void area(){
        System.out.println("This is squareee");
    }
}
