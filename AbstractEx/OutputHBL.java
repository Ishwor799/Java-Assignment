package AbstractEx;

public class OutputHBL {
    public static void main(String[] args) {
        HBL hbl= new HBL();

        //Abstract Method
        System.out.println("Interest rate is: "+hbl.getRateOfInterest());
       // hbl.getRateOfInterest();
        //Non Abstract Method
        hbl.display();

        // Static method
        HBL.displayBankName();
    }
}
