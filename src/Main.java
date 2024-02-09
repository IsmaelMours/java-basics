import generics.Box;
import generics.GenericMethodTest;
import generics.MaximumTest;
import java_files.CreateFile;
import java_files.GetFileInfo;
import java_files.ReadFile;
import java_files.WriteToFile;
import lambda.LambdaNumber;
import serialization.Employee;
import threads.RunnableDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<>();
//        list.add("Ravi");
//        list.add("Sk");
//        list.add("KS");
//        list.add("Lord");
//        list.add("Ravi");
//
//        Iterator itr = list.iterator();
//
//        while(itr.hasNext()){
//
//            System.out.println(itr.next());
//        }

Scanner scanner = new Scanner(System.in);


        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        colors.add(0, "Pink");




int count = 0;
        Iterator iterator = colors.iterator();

        for(int i = 0; i < colors.size(); i++)
        {
            String name = scanner.nextLine();

            if(colors.contains(name)){

                count ++;
            }


        }

System.out.println("The color was found : " + count);



    }
}
