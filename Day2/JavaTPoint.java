package Day2;

//INNER CLASS
abstract class Person {
	abstract void eat();
	abstract void washPlate();
}

@FunctionalInterface
interface Ars{
	public void demo();
//	private void demo2() {
//		System.out.println("hai");   //Syntax Error bcz in interface public class 
//									//cannot written bussiness method or we cannot create body of the methid
//	}
//	public void demo1(); //Throw Error bcz we can create one method in @functional interface but we create n number of private method
	private void demo2() {  // if the interface run private method also run hidely for privacy purpose
		System.out.println("hai");
	}
	default void demo3() {
		
	}
	static void demo4() {
		
	}
}

public class JavaTPoint {
	public static void main(String[] args) {
	
		Person person = new Person() {
			
			@Override
			void washPlate() {
				System.out.println("Wash the Plate....");
				
			}
			// we writeing bussiness statement when creating object....
			@Override
			void eat() {
				System.out.println("Am Eating food....");
				
			}
		};
		// person.eat to call the method
		person.eat();
		person.washPlate();
	}
}