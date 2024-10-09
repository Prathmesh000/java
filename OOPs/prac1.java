public class prac1 {
    public static void main(String[] args) {
       
        Person c = new Person(56, "Aryn");
        Person d = new Person(c);
        System.out.println(d.name);
        Person e = new Person(6, "Arynnnnn");
        System.out.println(c.pop);
        System.out.println(e.pop);
        System.out.println(c);
        Person.a = 90;
        System.out.println(Person.a);
    }
    
}
class Person{
    static int a = 56;
    int roll;
    String name;
    static int pop;
    Person(int roll, String name){
        this.name = name;
        this.roll = roll;
        Person.pop += 1;
    }
    Person(Person a){
        this.name = a.name;
        this.roll = a.roll;
    }
    public String toString(){
        return "Yoooooooo";
    }
}
