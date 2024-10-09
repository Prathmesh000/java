public abstract class absclass {
    int n;
    absclass(int num){
        this.n = num;
    }
     abstract void Career(String name);
     abstract void Partner(String name,int age);
     static void hello(){
        System.out.println("Hello");
     }

     public static void main(String[] args) {

        Son a = new Son(21);

        a.Career("Aryan");
        System.out.println(a.n);
        absclass.hello();
    }
    /* Here is a comment **** */
    /* This is also a comment /* More comments */ */
    /* This is also a comment // More comments */
    // /* This is a // // comment */
}
class Son extends absclass{

    public Son(int num){
        super(num);
    }

    @Override
    void Career(String name){
        System.out.println(name);
    }

    @Override
    void Partner(String name, int age){
        System.out.println(name);
    }
  
}
