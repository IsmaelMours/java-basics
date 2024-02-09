package java_files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile extends CreateFile {

    public void writeToFile(){
        try
        {
            FileWriter fileWriter= new FileWriter("filename.txt");
            fileWriter.write("This is my first time writing into this file ");
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch(IOException e)
        {

            System.out.println("An error occured. ");
            e.printStackTrace();
        }
    }
}
