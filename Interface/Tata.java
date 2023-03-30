package Interface;

public class Tata implements Car, Cycle {

    @Override
    public void speed(){
        System.out.println("Speed Limit of car is : 80KM / hr ");

    }
    @Override
    public void milage(){
        System.out.println("Average milage of car is : 10 KM / Ltr ");

            }
            @Override
    public void brand(){
                System.out.println("Brand cycle : Hero");
                System.out.println("Brand Car : Honda");

            }

}
