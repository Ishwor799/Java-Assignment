package ControlStatements.DecisionMaking.JumpStatement;

public class jumpEX {
    public void displayBreak(){

        for (int i=0; i<10; i++){
            if (i==5) {
                break; // continue;
            }
            System.out.println(i);
        }
    }
}
