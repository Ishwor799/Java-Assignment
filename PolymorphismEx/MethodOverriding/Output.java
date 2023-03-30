package PolymorphismEx.MethodOverriding;

public class Output {

    public static void main(String[] args) {
        Add add =new Add();
        add.sum();

        Calculate calc= new Calculate();
        calc.sum();

    }
}
