public class InnerClass {
    public static void main(String[] args) {
        
        OuterClass.InnerClass.greet();
        OuterClass.InnerClass obj = new OuterClass.InnerClass();
        System.out.println(obj.a);
    }
}
 class OuterClass{
    static int age = 20;
    int std = 12;
    public static class InnerClass{
        int a = 21;
       static void greet(){
            System.out.println("your age is "+ " " + age);
        }
    }
 }
