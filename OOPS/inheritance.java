package OOPS;

class animal{
    public void makesound() {
        String name = "Dog";
        System.out.println("Animals Makes Sound");
    }
}
class Dog extends animal{

}
public class inheritance {
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.makesound();
    }
}
