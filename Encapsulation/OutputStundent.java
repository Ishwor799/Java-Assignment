package Encapsulation;

public class OutputStundent {

    public static void main(String[] args) {
       Student student= new Student();
        student.setId(548);
        student.setName("Java");

        Student1 student1= new Student1(458,"ishwor");

        System.out.println("Student name is :"+student.getName() + " Student ID is :" + student.getId() );
        System.out.println("Student name is :"+ student1.getName() + " Student ID is :" + student1.getId() );

    }
}
