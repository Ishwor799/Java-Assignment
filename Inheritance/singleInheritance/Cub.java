package Inheritance.singleInheritance;

public class Cub extends Lion{

    public String name="Baby Lion";
    public String baby="This is from Class Cub";

        public void displayCub(){

                //calls child class instance
                System.out.println(baby);
                System.out.println("From Cub: " + name);
                //calls parents class instance
                System.out.println("From Cub: " + super.name);
                //calls parent class methods
                 super.animalColor();
            }

    }

