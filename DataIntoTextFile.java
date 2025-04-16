/*
    This class provides functionality to store the data into the file through writing code
 */

import java.io.*;

public class DataIntoTextFile {
    public static void main(String[] args) throws IOException {
        try{
            FileWriter fileLocation= new FileWriter("C:\\Files\\writer.txt");

            try{
                fileLocation.write("Hello World...");
                fileLocation.write("hiii how are you");
            }
            finally{
                fileLocation.close();
            }
            System.out.println("Finished");
        }
        catch (Exception e){
            e.getMessage();
        }




    }
}
