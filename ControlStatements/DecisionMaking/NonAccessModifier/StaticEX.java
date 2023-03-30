package ControlStatements.DecisionMaking.NonAccessModifier;

import java.util.Scanner;

public class StaticEX {

public static int cube(){
    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter integer no. for Cube :");
    int a=scanner.nextInt();
    return a*a*a ;


}    public static int cubeStatic( int a ){

        return a*a*a ;


    }
    public static float area(){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter length :");
        float l = scanner.nextFloat();
        System.out.println("Enter width :");
        float b = scanner.nextFloat();

        return  l*b ;


    }
    public static float areaStatic(float l, float b){

         return  l*b ;


    }

}
