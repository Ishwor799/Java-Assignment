package ControlStatements.DecisionMaking.NonAccessModifier;

import java.util.Scanner;

public class OutputStaticEX {
    public static void main(String[] args) {
      //  System.out.println("Area :" + StaticEX.area());
       // System.out.println("Cube :" +StaticEX.cube());
        float l,b;
        int a = 1; int z=1;
        Scanner scanner = new Scanner(System.in);
 do{
    System.out.println(" Enter length :");
    l= scanner.nextFloat();
    System.out.println("Enter width :");
    b = scanner.nextFloat();
   System.out.println("Area :" + StaticEX.areaStatic(l, b));
  } while ((l*b ) < 100);

        do { //  Scanner scanner= new Scanner(System.in);
            System.out.println("Enter integer no. for Cube :");
            a = scanner.nextInt();
            System.out.println("Cube :" + StaticEX.cubeStatic(a));
            z++;
        } while( z< 3);


    }
}
