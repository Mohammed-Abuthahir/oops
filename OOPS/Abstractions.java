package OOPS;

abstract class coffeeMachine{

    abstract void brewCoffee();

    public void TurnOn(){
        System.out.println("Machine Get Started");
    }
}
class expressomachine extends coffeeMachine{

    @Override
    public void brewCoffee(){
        System.out.println("Boiling water under high pressure... Grinding beans... Espresso is ready! ☕");
    }
}
public class Abstractions {
    public static void main(String[] args) {
        coffeeMachine mymachine = new expressomachine();
        mymachine.TurnOn();
        mymachine.brewCoffee();
    }

}
