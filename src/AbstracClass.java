abstract class AbstractCar{
    abstract void startEngine();
    abstract void stopEngine();
}
class AbstractSportsCar extends AbstractCar{
    String brand;
    boolean isEngineStart;
    public AbstractSportsCar(String brand){
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
        AbstractCar vertika=new AbstractSportsCar("buggati");
        vertika.startEngine();
        vertika.stopEngine();
    }

}