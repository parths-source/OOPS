//interface implementation
interface AbstractionCar{
    void startEngine();
    void stopEngine();
}
class AbstractionSportsCar implements AbstractionCar{
    String brand;
    String model;
    boolean isEngineOn=false;
    public AbstractionSportsCar(String brand,String model){
        this.brand=brand;
        this.model=model;
    }
    public void startEngine(){
        isEngineOn=true;
        System.out.println("Car started");
    }
    public void stopEngine(){
        isEngineOn=false;
        System.out.println("Car stopped");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        AbstractionCar my=new AbstractionSportsCar("mustang","racing car");
        my.startEngine();
        my.stopEngine();

    }

}
