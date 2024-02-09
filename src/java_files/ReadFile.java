package java_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public void readFile(){

        try
        {
            File file = new File("filename.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNext())
            {
                String data = sc.nextLine();
                System.out.println(data);

            }
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("An error occured. ");
            e.printStackTrace();

        }
    }
}
