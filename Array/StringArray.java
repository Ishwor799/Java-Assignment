package Array;

public class StringArray {


    public void MultiArray() {

        String[][] course = {{"Java", "C", "c++"}, {"c#","js","spring"}};

       // System.out.println(course[0][1]);

        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.print(" " + course[i][j]);
            }
            System.out.println();
        }

    }

/*
    public void courseArray() {
        String[] course = {"Java", "C", "c++"};

        for (String s : course) {

        if (s.equals("C")) {
            System.out.println("yes");
        } else {
            System.out.println("False");
        }
        }
    }
      /*  for (String s:course) {
           System.out.println("name of course is :" +s);
        }
        System.out.println(course[1]);

    }

       */

}
