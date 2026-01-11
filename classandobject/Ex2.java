
class car{
    String name;
    int price;
    void display(){
        System.out.println("name : "+ name);
        System.out.println("price :"+price );
    }
}
class Ex2{
    public static void main(String[] args){
        car c1 = new car();
        c1.name = "Toyoto";
        c1.price = 100000;
        c1.display();
        car c2 = new car();
        c2.name = "Ferrari";
        c2.price = 200000;
        c2.display();
    }
}