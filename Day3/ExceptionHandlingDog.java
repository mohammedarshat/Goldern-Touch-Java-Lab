package Day3;

public class ExceptionHandlingDog {
	public static void main(String[] args) throws Exception {
		Dog dog = new Dog();
		System.out.println(dog.play("Return biscate"));
		dog.play("biscate");
		System.out.println("...........Before Exception...........");
		dog.play("Stick");
		System.out.println("After Exception....");
	
	}
}

class Dog{
	public String play(String item) throws Exception {
		if(item.equals("Stick")) {
			throw new Exception();
		}else if(item.equals("Stone")) {
			throw new Exception();

		}else if(item.equals("biscate")) {
			System.out.println("Dog is vey much Happy.....");
		}
		return item;
	}
}
