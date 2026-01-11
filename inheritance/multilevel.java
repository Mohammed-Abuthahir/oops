// multilevel => one child acquired the properties from another child class is called 
// multilevel inheritance

class Grandfather {
    void gfProperty() {
        System.out.println("My properties for my son");
    }
}
class Father extends Grandfather {
    void fProperty() {
        System.out.println("My properties for my son");
    }
}
class Son extends Father {
    void sonAccess() {
        System.out.println("I access both properties");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.gfProperty();
        s1.fProperty();
        s1.sonAccess();
    }
}
