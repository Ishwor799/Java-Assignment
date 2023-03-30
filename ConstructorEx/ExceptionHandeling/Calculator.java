package ConstructorEx.ExceptionHandeling;

import java.util.Scanner;

public class Calculator {

    public void calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st no.: ");
        int a= scanner.nextInt();

        System.out.println("enter 2nd no.: ");
        int b= scanner.nextInt();

        try {
            System.out.println("Division of two no. is :" + (a / b));
        } catch(ArithmeticException e) {
          //  e.printStackTrace();
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("It is always executed");
        }

        //public void displayAge1(int age) {
         //   if (age <20){
          //      throw new ArithmeticException("TeenAge");
           // }else {
         //       System.out.println("Good to go...");
         //   }
      //  }

        // public void displayAge2(int age1) throws ArithmeticException {
        //    if (age1 <20){
         //       throw new ArithmeticException("TeenAge");
         //   }else {
         //       System.out.println("Good to go...");
         //   }

        }

    }

