package AbstractEx;

public abstract class  Bank {

    public Bank(){
        System.out.println("Parent's Constructor");
    }
    public abstract int getRateOfInterest();

    public void display(){
        System.out.println("This is Bank");
    }

    public static void displayBankName(){
        System.out.println("This is Head Bank: ");
    }



}
