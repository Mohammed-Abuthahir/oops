package ExceptionHandling;

public class tryandcatch {
    public static void main(String[] args) {
        try{
            System.out.println("Step 1: Inside try block. Executing risky code...");
            int result = 10 / 0; // Throws ArithmeticException
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This finally Always Excecuted");
        }
        System.out.println("Outside the block.Program Continue safely");
    }

}

