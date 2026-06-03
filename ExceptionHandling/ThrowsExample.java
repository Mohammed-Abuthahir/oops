package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample {
    public static void findfile() throws FileNotFoundException{
        FileReader file = new FileReader("non_existent_file.txt");
    }
    public static void main(String[] args) {
        try{
            findfile();
        }
        catch (FileNotFoundException e){
            System.out.println("Caught propagated exception: File was not found!");
        }
    }
}
