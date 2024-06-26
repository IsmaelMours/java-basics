package static_keyword;

//Java Program to demonstrate the use of static variable  
class Student{
    int rollno;//instance variable
    String name;
    static String college ="ITS";//static variable
    static int count = 0;
    //constructor  
    Student(int rollno, String name){
        count++;
        this.name =name;
        this.rollno = rollno;
    }
    //method to display the values  
    void display (){System.out.println(rollno+" "+name+" "+college +" "+ count);}
}
//Test class to show the values of objects
public class TestStaticVariable1{
    public static void main(String args[]){
        Student s1 = new Student(111,"Karan");
        Student s2 = new Student(222,"Aryan");
        //we can change the college of all objects by the single line of code
        Student.college="BBDIT";
        s1.display();
  s2.display();
    }


    static {
        System.out.println("This is static block");
    }
}