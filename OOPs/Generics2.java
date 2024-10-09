
class Container<T, S>{
   T info;

    Container(T data, S data2){
        this.info = data;
        System.out.println(data2);
    }
    void display(){
        System.out.println(this.info);
    }
}


public class Generics2 {
    public static void main(String[] args) {
        
        Container<String, Integer> obj = new Container<>("Aryan",61);
        obj.display();
    }
}
