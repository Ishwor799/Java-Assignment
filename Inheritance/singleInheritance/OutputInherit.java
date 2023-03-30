package Inheritance.singleInheritance;

import java.sql.SQLOutput;

public class OutputInherit {
    public static void main(String[] args) {

            Cat cat = new Cat();
            Lion lion= new Lion();
            Cub cub=new Cub();
           // System.out.println(cat.child);
            //System.out.println(cat.name);
            //cat.animalColor();

        cat.displayCat();
        lion.displayLion();
        cub.displayCub();

    }
}
