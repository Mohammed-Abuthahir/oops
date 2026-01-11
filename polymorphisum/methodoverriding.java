// runtimepolymorphisum --> child class provides the own implementation of method that
// already declare in the parent class
// Polymorphism is an OOP concept where a method behaves differently in different situations.
class Animal{
    void sound(){
        System.out.println("Animal Makes Sound");
    }
}
class dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class methodoverriding{
    public static void main(String[] args){
        Animal A1 = new dog();
        A1.sound();
    }
}