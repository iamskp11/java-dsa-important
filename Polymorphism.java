class Integers {
	public void print_first(int n) {
		System.out.println("Print first n numbers in loop");
	}
	public void printStart() {
		System.out.println("Start of number is -inf");
	}
}


class RealNumbers extends Integers {
	private int start;
	public RealNumbers() {
		this.start = 0;
	}
	public void print_first(int n) {
		for(int i=this.start; i<this.start+n;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public void print_first(int start, int end, int limit) {
		for(int i=start; i<=end && i<=start+limit; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

class NaturalNumbers extends RealNumbers {
	private int start;
	public NaturalNumbers() {
		this.start = 1;
	}
	public void printStart() {
		System.out.println("Start of natural number is " + this.start);
	}

	// Method overriding
	public void print_first(int n) {
		for(int i=this.start; i<this.start+n;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// Method overloading
	public void print_first(int start, int end, int limit) {
		for(int i=start; i<=end && i<start+limit; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		RealNumbers r = new RealNumbers();
		r.print_first(10);
		r = new NaturalNumbers();
		r.print_first(10);
		r.print_first(11, 20, 4);
	}
}