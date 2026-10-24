//interface implementation
interface Car{
    void startEngine();
    void stopEngine();
}
class SportsCar implements Car{
    String brand;
    String model;
    boolean isEngineOn=false;
    public SportsCar( String brand,String model){
        this.brand=brand;
        this.model=model;
    }
    public void startEngine(){
        isEngineOn=true;
        System.out.print("car stated ");
    }
    public void stopEngine(){
        isEngineOn=false;
    }
}

public class Abstraction {
    static void main() {
        Car my=new SportsCar("mustang","racing car");
        my.startEngine();
        my.stopEngine();

    }

}
