public class singleton {
    public static void main(String[] args) {
        
        Sing obj1 = Sing.getInstance();
        System.out.println(obj1.a);
    }
}

class Sing{

    public int a = 10;
    private Sing()
    {

    }
    static Sing obj = new Sing();
    public static Sing getInstance(){
        return obj;
    }
}
