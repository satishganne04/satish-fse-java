package question3;

public class WildAnimal extends Animal{

	@Override
	public void eat() {
		 System.out.println("Wild animal is eating");
		
	}

	@Override
	public void sleep() {
		 System.out.println("Wild animal is sleeping");
		
	}
	 public void kill() {
	        System.out.println("Wild animal is hunting");
	    }

}
