package OOPS;

class Car{
    public String name;
    public int price;

    public Car(String n1, int p1){
        name = n1;
        price = p1;
    }

    public void displayDetails(){
        System.out.println(name + " " + price);
    }
}
public class constractor {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", 20000000);
        Car car2 = new Car("Porsugal", 10000000);

        car1.displayDetails();
        car2.displayDetails();
    }
}
