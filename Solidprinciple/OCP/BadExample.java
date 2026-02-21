// Software entities (classes, modules, functions) should be open for extension but closed for modification.

// You should add new behavior without modifying existing code.

class DiscountService {

    public double calculateDiscount(String type, double amount) {

        if (type.equals("DIWALI")) {
            return amount * 0.20;
        } else if (type.equals("NEWYEAR")) {
            return amount * 0.30;
        }

        return 0;
    }
}
class BadExample{
    public static void main(String[] args){

    }
}