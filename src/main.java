abstract class MainCar{
    abstract void startEngine();
    abstract void stopEngine();
}
class MainSportsCar extends MainCar{
    String brand;
    boolean isEngineStart;
    public MainSportsCar(String brand){
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

public class main{
    public static void main(String args[]) {
        MainCar vertika=new MainSportsCar("buggati");
        vertika.startEngine();
        vertika.stopEngine();
    }

}