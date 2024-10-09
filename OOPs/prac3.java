public class prac3 {
    public static void main(String[] args) {

        Child obj = new Child(5);
        System.out.println(obj.age);
        Child.a();
    
        
    }
}
    class Child extends Parent{
            Child(int a){
                super(a);
            }
            @Override
            void greet(String a){
                System.out.println("Hellooo");
            }
        }


abstract class Parent{

    int age;

    Parent(int a){
        this.age = a;
    }
    abstract void greet(String a);

    static void a() {
         System.out.println("Heyy"); 
        }
}

interface ary{
    int a = 10;

    abstract void abcd();

}