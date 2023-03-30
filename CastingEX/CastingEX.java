package CastingEX;

public class CastingEX {

    public void wideningCasting() {
        int a=5;
        System.out.println("Before weidining casting : "+a);

        float b=a;
        System.out.println("After Weidining Casting : "+b);

    }
    public void NarrowingCasting() {
    float f=5.6f;
        System.out.println("Before narrow casting : " +f);

        int a=(int) f;
        System.out.println("After nerrow casting : " +a);


    }

}
