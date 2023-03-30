package LoopStatement;

import java.util.Scanner;

public class LoopEx {

    public void displayforloop() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String sn = scanner.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello:" + sn);
        }
    }

    public void displayforloop2() {

        // Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter your Name : ");
        //String sn= scanner.nextLine();

        int i = 1;
        int m = 5;
        while (i <= 10) {
            System.out.println("5 * " + i + "=" + (i * m));
            i++;
        }

    }

    public void displayforloopMultiply() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number = scanner.nextInt();

        int i = 1;
        do {
            System.out.println(number + "* " + i + "=" + (i * number));
            i++;
        }
        while (i <= 10);
    }
}