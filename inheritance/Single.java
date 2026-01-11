// inheritance => One class Acquires the properties and Behaviour From another class
// is called inheritance
 
// Single Inheritence =>  One child class using property from one parent Class;

class Animal{
    
    void eat(){
        System.out.println("Animal Eating");
    }
}
class dog extends Animal{
    
    void bark(){
        System.out.println("Dog Barking");
    }
}

class Single{
    public static void main(String[] args){
        dog d1 = new dog();
        d1.bark();
        d1.eat();

    }
}