// Objects of a superclass should be replaceable with objects of its subclasses without altering the correctness of the program.

// Child classes must behave properly as their parent type.
class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Penguin extends Bird {
    public void fly() {
        throw new UnsupportedOperationException();
    }
}
class BadExample{
    public static void main(String[] args){
        
    }
}