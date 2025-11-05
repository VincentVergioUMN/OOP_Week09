package week09.vincent.id.ac.umn;

public class Mammal implements Animal{
	
	public Mammal() {}
	
	public void eat() {
		System.out.println("Mammal eats");
	}
	
	public void travel() {
		System.out.println("Mammal travel");
	}
	
	public static void main(String[] args) {
		Mammal m = new Mammal();
		m.eat();
		m.travel();
	};
}