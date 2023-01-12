package question4;

public class Candidate {
	String name;
    int age;
    String education;

    public Candidate(String name, int age, String education) throws AgeException, EduException {
        if (age < 21) {
            throw new AgeException("under age");
        }
        if (age > 60) {
            throw new AgeException("over age");
        }
        if (!education.equals("Btech")) {
            throw new EduException("sorry, invalid education");
        }
        this.name = name;
        this.age = age;
        this.education = education;
    }

}
