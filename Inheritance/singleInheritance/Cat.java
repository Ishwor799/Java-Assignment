package Inheritance.singleInheritance;

public class Cat extends Animal{

  //  public Cat(){
  //      super();
  //  }
    public String name="Cat";
    public String child =" This is child class (Cat): ";

    public void displayCat(){

        System.out.println(child);
        //calls child class instance
        System.out.println("From Cat: " + name);
        //calls parents class instance
        System.out.println("From Cat: " +super.name);
        //calls parent class methods
        super.animalColor();
    }
}
