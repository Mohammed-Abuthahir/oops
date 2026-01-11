// super refers to the parent class object.
// It is used to access parent class variables, methods, and constructors.
class Vehicle{
    int speed = 100;
}
class car extends Vehicle{
    int speed = 60;
    void display(){
        System.out.println(super.speed);
        System.out.println(speed);
    }
}
class Super{
    public static void main(String[] args){
        car c = new car();
        c.display();
    }
}