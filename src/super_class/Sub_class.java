package super_class;

public class Sub_class extends Super_class {
    int num = 20;

    // display method of subclass
    public void display() {
        System.out.println("This is the display method of subclass");
    }
    public void my_method() {
        // Instantiating subclass
        Sub_class sub = new Sub_class();

        // Invoking the display() method of subclass
        sub.display();

        // Invoking the display() method of superclass
        super.display();

        super.viewMe();

        // printing the value of variable num of subclass
        System.out.println("value of the variable named num in sub class:"+ sub.num);

        // printing the value of variable num of superclass
        System.out.println("value of the variable named num in super class:"+ super.num);
    }


}
