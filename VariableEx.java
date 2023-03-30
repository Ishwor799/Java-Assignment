import javax.swing.plaf.synth.SynthOptionPaneUI;

public class VariableEx {

    // static variable
        static int d=559;

    //instance variable
       int b=779;

    //method
    public void display () {

      //local variable
        int a=5;
                System.out.println("local variable is : "+a);
                System.out.println("instance variable is : "+b);
    }

    //main method
    public static void main(String[] args) {
        VariableEx abcd =  new VariableEx();
        abcd.display();
        System.out.println(abcd.b);
        System.out.println(VariableEx.d);
    }
}



