package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateAndWriteFile {
    public  static void main(String[] args){
        String filename = "output.txt";
       try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
           writer.write("Hello World");
           writer.write("My Name is Abutahhir");
       } catch (IOException e) {
           System.out.println(e.getMessage());
       }
    }
}
