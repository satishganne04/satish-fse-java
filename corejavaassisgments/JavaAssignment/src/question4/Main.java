package question4;

public class Main {
	public static void main(String[] args) {
        try {
            Candidate candidate1 = new Candidate("satish", 25, "Btech");
          //  Candidate candidate2 = new Candidate("ganesh", 15, "Btech"); 
          //  Candidate candidate3 = new Candidate("mahesh", 65, "Btech"); 
          //  Candidate candidate4 = new Candidate("ramesh", 30, "BA"); 
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        } catch (EduException e) {
            System.out.println(e.getMessage());
        }
    }
}
