public class interfaces1 {
    public static void main(String[] args) {
        
        // Engine obj = new PowerEngine();
        // obj.Start();
        // obj = new ElectricEngine();
        // obj.Start();
        Car a = new Car();
        a.Start();
        a.main(args);
        PowerEngine ab = new PowerEngine();
        System.out.println(ab.a);
        
    }
}


class Car {
    public static void main(String[] args) {
        System.out.println("Arssssss");
    }
    
    private Engine obj;
    Car(){
        obj = new PowerEngine();
    }
    Car(Engine engine){
        obj = engine;
    }
    void Start(){
        obj.Start();
    }
    void Stop() {
       obj.Stop();
    }

}

interface Engine{
    int a = 7;
    void Start();

    void Stop();
    static void g(){
        System.out.println();
    };
    default void ad(){

    };
}

class PowerEngine implements Engine{

    @Override
    public void Start() {
      System.out.println("PowerEngine Starts");
    }

    @Override
    public void Stop() {
       System.out.println("Power Engine Stops");
    }

}

class ElectricEngine implements Engine{

    @Override
    public void Start() {
      System.out.println("Electric Engine Starts");
    }

    @Override
    public void Stop() {
       System.out.println("Electric Engine Stops");
    }

}