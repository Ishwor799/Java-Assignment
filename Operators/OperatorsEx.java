package Operators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OperatorsEx {

    public void displayName (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name.: " );
        String s =  scanner.nextLine();

          if (s.equals("ishwor")) {
            System.out.println("Your Name is .:" + s);
        } else
        {
            System.out.println("Your Name is incorrect.");
        }
    }

    public void arthimaticOperators ()
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st no.: " );
        int c =  scanner.nextInt();
        System.out.println("Enter 2st no.: " );
        int d = scanner.nextInt();
        System.out.println("Sum of two no.:" +(c+d));


        int a=5;
        int b=7;
        // int c=a+b;

       // System.out.println("Sum of two no.:" +(c+d));
        System.out.println("Multiply of two no." +(a*b));

        //

    }

    public void examMarks ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Marks Obtained in Math: " );
        int math =  scanner.nextInt();
               System.out.println("Marks Obtained in Science: ");
            int science = scanner.nextInt();
            int pcnt = (math + science) / 2;

        if (math <=100 && math >= 0 && science <=100 && science >= 0) {

            if (math >= 40 && science >= 40) {
                System.out.print("Pass and " + pcnt+"% with ");
                if (pcnt < 60) {
                    System.out.println("2nd Division");
                } else if (pcnt >= 60 && pcnt < 80) {
                    System.out.println("1nd Division");
                } else if (pcnt >= 80) {
                    System.out.println("Distinction");
                }
            else System.out.println("Failed ");
            }
        }else{

            System.out.println( "Inserted marks is incorrect");
        }
    }

    public static void main(String[] args) {
        OperatorsEx zz= new OperatorsEx();
       // zz.arthimaticOperators();
       //  zz.displayName();
         zz.examMarks();

    }

}
