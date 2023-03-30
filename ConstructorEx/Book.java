package ConstructorEx;

public class Book {
    int pageNo= 55;

    public Book(){
        System.out.println("This is non parameter const:");
    }

    public Book(String name){
        System.out.println("Book name is :"+name); // parametrized constructor
    }

    public void displayPage() //method signature
    {
        System.out.println("page Number is : " +pageNo);
    }

    public void displayPage(String name)
    {
        System.out.println("page Number is : " +pageNo +"Name of book is :" +name);
    }
}
