public class Generics <T>{
    T random;
    public Generics(T data){
        this.random = data;
    }
    private void print(){
        System.out.println(random);
    }

    public static void main(String[] args) {
        Generics<Integer> obj = new Generics <>(21);
        Generics<String> obj1 = new Generics <>("Aryan");
        obj.print();
        obj1.print();
        System.out.println(obj);

    }
}
