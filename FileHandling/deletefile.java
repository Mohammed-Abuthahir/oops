package FileHandling;

import java.io.File;

public class deletefile {
    public static void main(String[] args) {
        File myFile = new File("output.txt");

        if (myFile.exists()) {
            if (myFile.delete()) {
                System.out.println("File deleted successfully: " + myFile.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
