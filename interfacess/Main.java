// interfaces --> An Interface in Java is a blueprint of a class that contains only abstract methods (before Java 8) and method declarations.
interface Animal {
    void sound();  
}


class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();   // abstraction
        a.sound();
    }
}
// loosly coupling --> Changing one class Does Not Affected Another
