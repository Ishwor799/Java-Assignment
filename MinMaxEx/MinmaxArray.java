package MinMaxEx;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MinmaxArray {

    public void minmax() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of Array");
        int n = scanner.nextInt();
        int a[] = new int[n];
        int l = a[0];
        int s;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " interger number ");
            a[i] = scanner.nextInt();
        }

        for (int j = 1; j < n; j++) {
            if (l < a[j]) {
                l = a[j];
            }
        }

        s = a[0];
        for (int k = 1; k < n; k++) {
            if (s > a[k]) {
                s = a[k];
            }
        }
        System.out.println("Largest no. is : " + l);
        System.out.println("Smallest no. is : " + s);
    }

}




