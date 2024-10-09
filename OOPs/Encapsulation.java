public class Encapsulation {
    public static void main(String[] args) {
        Encap obj = new Encap();
        obj.setAge(45);
        System.out.println(obj.getAge());
    }
}
 class Encap{
    private int age;
    private int date;

    int getAge(){
        return this.age;
    }
    public int getDate(){
        return this.date;
    }
    public void setAge(int n){
        this.age = n;
    }
    public void setDate(int n){
        this.date = n;
    }
}
