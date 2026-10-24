abstract class Car{
    abstract void startEngine();
    abstract void stopEngine();
}
public class SportsCar extends Car{
    String brand;
    boolean isEngineStart;
    public SportsCar(String brand){
        this.brand=brand;
    }
    public void startEngine(){
        isEngineStart=true;
        System.out.println("start the car");
    }
    public void stopEngine(){
        isEngineStart=false;
        System.out.println("stop the car");

    }
}

public class AbstracClass{
    public static void main(String args[]) {
        Car vertika=new SportsCar("buggati");
        vertika.startEngine();
    }

}