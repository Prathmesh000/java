public interface interfaces {
    int PRICE = 70000;

    void start();
    void stop();
    void breakk();
    public static void main(String[] args) {
        Car a = new Car();
        a.start();
        a.stop();
        a.breakk();
    }

}
interface brake{
    void breakk();
}

class Car implements interfaces, brake{
    @Override
    public void start(){
        System.out.println("Car Starts");
    }
    @Override
    public void stop(){
        System.out.println("Car Stops");
    }
    @Override
    public void breakk(){
        System.out.println("Breakkk");
    }
}