package OOPS;

abstract class vehicle{
    String brand;

    public vehicle(String brand){
        this.brand = brand;
    }

    abstract void fuelType();

    void startEngine(){
        System.out.println("Engine Started SucessFully");
    }
}

interface GPS{
    void trackLocations();
}

class smartcar extends vehicle implements GPS{

    public smartcar(String brand){
        super(brand);
    }

    @Override
    public void fuelType() {
        System.out.println("Diesel");
    }

    @Override
    public void trackLocations() {
        System.out.println("I am in Madurai");
    }
}

public class abstractvsinterface {
    public static void main(String[] args) {
        smartcar smartcar = new smartcar("Tesla");
        System.out.println(smartcar.brand);
        smartcar.fuelType();
        smartcar.trackLocations();
    }
}
