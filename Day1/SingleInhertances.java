package Day1;

//1. Class: A class is a collection of objects with similar attributes. It's a blueprint or template 
//from which items are made. 
//2. Sub Class/Child Class: Subclass is a class which inherits the other class. It is also called 
//a derived class, extended class, or child class. 
//3. Super Class/Parent Class: The features of a subclass are inherited from the superclass. 
//It's also known as a parent class or a base class. 
//4. Reusability: Reusability, as the name implies, is a feature that allows you to reuse the ields and
//methods of an existing class while creating a new one. The fields and methods 
//defined in the preceding class can be reused. 

public class SingleInhertances {
	public static void main(String[] args) {
		Sub b = new Sub();
		b.printA();
		b.printB();
	}

}

class Super {
	public void printA() {
		System.out.println("Class-A");
	}
}

class Sub extends Super {
	public void printB() {
		System.out.println("class-B");

	}
}

