import java.util.ArrayList;

public class prac5 {
    public static void main(String[] args) {
        Container<Integer> obj = new Container<>(89);
        obj.show();
        obj.set(900);
        obj.show();
        obj.fn(new ArrayList<Number>());
    }
}
 class Container<T extends Number>{

    T val;
    Container(T a){
        this.val = a;
    }
    T demo(){
        return val;
    }
    void show(){
        System.out.println(val);
    }
    void set(T n){
        this.val = n;
    }
    public void fn(ArrayList<? super T> obj){

    }
 }