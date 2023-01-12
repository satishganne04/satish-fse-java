package question3;

public class Test {
	public static void main(String[] args) {
		 Bird bird = new Bird();
	        bird.eat();
	        bird.sleep();
	        bird.fly();

	        WildAnimal wildAnimal = new WildAnimal();
	        wildAnimal.eat();
	        wildAnimal.sleep();
	        wildAnimal.kill();
	        
	        Animal animal1 = new Bird();
	        animal1.eat();
	        animal1.sleep();
	        Animal animal2 = new WildAnimal();
	        animal2.eat();
	        animal2.sleep();
	        
	}

}
