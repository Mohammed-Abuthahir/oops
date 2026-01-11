// Hierarchical => more than one class acquired the properties from same parent class

class Animal{
    void eat(){
        System.out.println("Animal Eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barking");
    }
}
class Cat extends Animal{
    void mewo(){
        System.out.println("Cat mewo");
    }
}

class Hierarchical{
    public static void main(String[] args){
        Cat c1 = new Cat();
        c1.mewo();
        c1.eat();
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
    }
}