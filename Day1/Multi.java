package Day1;

//Notes :
//	 Multilevel Inheritance, one class can inherit from a derived class. Hence, the derived class 
//	becomes the base class for the new class
public class Multi {
	public static void main(String[] args) {
		Subs c = new Subs();
		c.printA();
		c.printB();
		c.printC();
	}
}

class SuperSuper {
	public void printA() {
		System.out.println("Class-A");
	}
}

class SubSub extends SuperSuper {
	public void printB() {
		System.out.println("Class-B");
	}
}

class Subs extends SubSub {
	public void printC() {
		System.out.println("Class-C");
	}
}
