package pkg_learning;

interface Mammal {
    public void eat();
 
    public void move();
 
    public void sleep();
}
abstract class Animal implements Mammal {
    public void eat() {
        System.out.println("Eating...");
    }
 
    public void move() {
        System.out.println("Moving...");
    }
 
    public void sleep() {
        System.out.println("Sleeping...");
    }
	/*
	 * public static void bark() { System.out.println("no"); }
	 */
 
}
class Dog extends Animal {
    public void bark() {
        System.out.println("Gow gow!");
    }
    public void eat() {
        System.out.println("Dog is eating...");
    }
}
 
class Cat extends Animal {
    public void meow() {
        System.out.println("Meow Meow!");
    }
}
class AnimalTrainer {
    public void teach(Animal anim) {
        anim.move();
        anim.eat();
        anim.sleep();
    }
}
public class inheri_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog = new Dog(); 
		//Dog.bark();
		
		Animal anim = (Animal) dog; 
		anim.eat();
		//anim.bark();
		  
		Cat cat = new Cat(); 
		AnimalTrainer trainer = new AnimalTrainer();
		trainer.teach(dog); 
		trainer.teach(cat);
		 
		
		Mammal a = new Dog();
		System.out.print("Eat: ");
		a.eat();
		System.out.print("Move: ");
		a.move();//child class or concrete class has to implement all abstract classes and that implementation is called out
		
		//Static method is always called from class level so there is no concept of overriding
		
		
	}

}
