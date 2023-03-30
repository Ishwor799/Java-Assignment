package ConstructorEx.ExceptionHandeling.CustomException;

public class Vote {
    public void eligibilityVote (int age) throws InvalidAgeException{

        if(age < 18){
            throw  new InvalidAgeException("Cannot vote");

        }else  {
            System.out.println("Can vote: ");
        }

    }
}
