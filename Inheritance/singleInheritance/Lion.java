package Inheritance.singleInheritance;

import jdk.swing.interop.SwingInterOpUtils;

public class Lion extends Animal {
     //super();

    public String child =" This is child class (Lion) : ";
    public String name="Lion";

       public void displayLion(){

        //calls child class instance
           System.out.println(child);
        System.out.println("From Lion: " + name);
        //calls parents class instance
        System.out.println("From Lion: " + super.name);
        //calls parent class methods
       // super.animalColor();
    }
}
