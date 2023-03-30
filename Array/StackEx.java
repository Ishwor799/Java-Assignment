package Array;

import java.util.Scanner;
import java.util.Stack;

public class StackEx {

    public void displayStack(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any word :");
        String inputString =  scan.nextLine();

        //Stack
        Stack stack = new Stack();
        for (int i=0; i < inputString.length(); i++){
            stack.push(inputString.charAt(i));
        }
        System.out.println(stack);

        String reverseString ="";

        while (!stack.isEmpty()){
            reverseString +=  stack.pop();
        }
        if (inputString.equals(reverseString)) {
            System.out.println("Palindrome :");
        }else {
            System.out.println("Not Palindrome : ");
        }
    }
}
