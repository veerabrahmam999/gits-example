/*
    This class provides functionality to read the data from a file
 */


import java.io.File;
import java.util.Scanner;

public class FileReader {


    public static void main(String[] args) {
        try {
            File fileLocation = new File("C:\\Files\\writer.txt");

            Scanner scanner = new Scanner(fileLocation);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("File not found!");
        }

    }

}
