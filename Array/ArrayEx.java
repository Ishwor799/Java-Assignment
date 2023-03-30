package Array;

public class ArrayEx {

    public void display(){
        int number[]= {1,2,3,4,5};
        int sum=0;

        for (int i=0; i <number.length; i++){
            sum=sum+ number[i];
            System.out.println(sum);
        }

      //  int numbers[] = new int[10];
       // numbers[0]= 10;

    }

    public void display1(){
        int number[]={1,2,3,4,5};
        int sum=0;

        //For Each Loop
         for (int i:number) {
             //sum += sum+ number[i];
             sum +=number[i];
             System.out.println(sum);
         }

    }

    public void display2(){
        int number[]={1,2,3,4,5};
        int sum=0;

        //For Each Loop
        for (int i:number) {
            sum = sum + number [i-1];
          // System.out.println(i);
        }
        System.out.println("Sum of no. in array :" +sum);

    }




}
