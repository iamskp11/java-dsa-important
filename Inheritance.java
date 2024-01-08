class Animal {
	void speak() {
		System.out.println("I am speaking");
	}
	void sleeping() {
		System.out.println("I am sleeping");
	}
	private void private_act() {
		System.out.println("Doing private activity");
	}

	void do_private_activity() {
		this.private_act();
	}
}


class MarineAnimals extends Animal {
	void swim() {
		System.out.println("I am swimming");
	}
} 

class FlyingAnimals extends Animal {
	void fly() {
		System.out.println("I am flying");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Animal fish = new MarineAnimals();
		fish.do_private_activity();

		FlyingAnimals crow = new FlyingAnimals();
		crow.do_private_activity();
	}
}