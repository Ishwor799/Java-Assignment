package ControlStatements.DecisionMaking;

import java.util.Scanner;

public class College {

    public void examMarks ()
    {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Marks Obtained in Math: ");
    int math = scanner.nextInt();

    System.out.println("Marks Obtained in Science: ");
    int science = scanner.nextInt();

    int pcnt = (math + science) / 2;

        if (math <=100 && math >= 0 && science <=100 && science >= 0) {
            if (math >= 40 && science >= 40) {
                System.out.print("Pass and " + pcnt + "% with ");
                if (pcnt < 60) {
                    System.out.println("2nd Division");
                } else if (pcnt >= 60 && pcnt < 80) {
                    System.out.println("1st Division");
                } else if (pcnt >= 80) {
                    System.out.println("Distinction");
                }
            }
            else {
                    System.out.println("Failed & total " +pcnt +"%");
                }

        }else{
            System.out.println( "Inserted marks is incorrect");
            }
    }
}
