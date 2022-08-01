package Day1;

//Notes :
//	Multiple Inheritance is one of the inheritance in Java types where one class extending more than 
//	one class. Java does not support multiple inheritance. 

public class MultipleInheritance {
	public static void main(String[] args) {
		Child c = new Child();
		c.printLogic();
		c.printMojo();
	}
}

interface MyInterA {
	public void printLogic();
}

interface MyInterB {
	public void printMojo();
}

interface MyInterC extends MyInterA, MyInterB {
	public void printLogic();
}

class Child implements MyInterC {
	@Override
	public void printLogic() {
		System.out.println("Logic");
	}

	@Override
	public void printMojo() {
		System.out.println("Mojo");
	}
}
