// Software entities (classes, modules, functions) should be open for extension but closed for modification.

// You should add new behavior without modifying existing code.
interface Discount {
    double calculate(double amount);
}

class DiwaliDiscount implements Discount {
    public double calculate(double amount) {
        return amount * 0.20;
    }
}

class NewYearDiscount implements Discount {
    public double calculate(double amount) {
        return amount * 0.30;
    }
}
class Goodexample{
    public static void main(String[] args){

    }
}