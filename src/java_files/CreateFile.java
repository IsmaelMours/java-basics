package java_files;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public void createFile(){

        try{
            File myFile = new File("filename.txt") ;
            if(myFile.createNewFile()){
                System.out.println("File created on : " + myFile.getAbsolutePath() + " file name is: "+ myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }
}
