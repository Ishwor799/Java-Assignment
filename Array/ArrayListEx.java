package Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {

        public void displayCourse(){

        ArrayList<String> arrayList= new ArrayList<String>();

        System.out.println("Before Adding to the list: " + arrayList);
        arrayList.add("Java");
        arrayList.add("C++");
        arrayList.add("c#");
        System.out.println("After Adding to the list: " + arrayList);

        System.out.println("Data in 2nd position : " + arrayList.get(1));

        for (String course:arrayList){
            System.out.println("After iterating through Loop :" +course);
        }
// to check "Java" in array
        System.out.println(arrayList.contains("Java"));

        // to remove data from array
        arrayList.remove("C++");
        System.out.println("After removing from arraylist : " + arrayList);

        // to set / update data in array

        arrayList.set(1, "Spring");
        System.out.println("After updating from arraylist : " + arrayList);

        // to short data in array
        Collections.sort(arrayList);
        System.out.println("After sorting : " +arrayList);

       // reversed order
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("After sorting : " +arrayList);

        // size of array list
        System.out.println("Size of array is " + arrayList.size());

    }


    public void student(){
                ArrayList <Student> students =new ArrayList<>();
                Student student =new Student();
                student.setId(12);
                student.setName("java");

                students.add(student);
            System.out.println(students);

        Student student1 =new Student();
        student1.setId(13);
        student1.setName("C#");

        students.add(student1);
        System.out.println(students);
    }
}
