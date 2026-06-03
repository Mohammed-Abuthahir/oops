package ExceptionHandling;

public class ThrowExample {
    public static void checkAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("Access denied: You must be at least 18 years old.");
        }
        System.out.println("Access Granted");
    }
    public static void main(String[] args) {
        try{
            checkAge(15);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
