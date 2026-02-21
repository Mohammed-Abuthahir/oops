class Employee {
    // Access Modifiers
    private int empId = 101;        // private
    public String name = "Abu";     // public
    protected double salary = 50000; // protected
    int age = 25;                  // default

    // Specifiers
    static String company = "TCS";   // static
    final String country = "India";  // final

    // public method
    public void display() {
        System.out.println(empId);    // private accessed inside class
        System.out.println(name);
        System.out.println(salary);
        System.out.println(age);
        System.out.println(company);
        System.out.println(country);
    }
}
public class Main {
    public static void main(String[] args) {

        Employee e = new Employee();
        // System.out.println(e.empId); ❌ private - not allowed
        System.out.println(e.name);      // ✔ public
        System.out.println(Employee.company); // ✔ static
        e.display();   // access all inside class
    }
}
