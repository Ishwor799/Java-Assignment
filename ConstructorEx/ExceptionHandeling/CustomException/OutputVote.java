package ConstructorEx.ExceptionHandeling.CustomException;

public class OutputVote {
    public static void main(String[] args) {
        Vote vote = new Vote();

        try {
            vote.eligibilityVote(21);
        } catch (InvalidAgeException e) {
            //      e.printStackTrace();
            System.out.println("Eligible: ");
        }
    }
}
