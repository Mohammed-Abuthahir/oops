package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) {
        String fileName = "output.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.newLine();
            writer.write("This new line is appended to the file!");

            System.out.println("Data appended successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
