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
    }
}
public class inheri_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Animal anim = (Animal) dog;
		anim.eat();
		
		Cat cat = new Cat();
		AnimalTrainer trainer = new AnimalTrainer();
		trainer.teach(dog);
		trainer.teach(cat);
	}

}
