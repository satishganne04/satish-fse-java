package question2;

public class Author {
    private String name;
    private int age;
    private String gender;

    @Override
	public String toString() {
		return "Author [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public Author(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }
}