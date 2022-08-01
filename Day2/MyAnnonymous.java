package Day2;

public class MyAnnonymous {
	public static void main(String[] args) {
		
		new Teachers() {
			@Override
			public void teach() {
				System.out.println("Annonymous Implementation with out a Name...");
			}
		}.teach();

		Teachers teachers = new Teachers() {
			@Override
			public void teach() {
				System.out.println("Annonymous implementaion with name...");
			}
		};
		teachers.teach();

		// Return String
		Doctor doctor = new Doctor() {
			@Override
			public String demo() {
				//System.out.println("String Annonymous implementation with name....");
				return "String Annonymous implementation with name....";
			}
		};
		doctor.demo();
		String str = doctor.demo();
		System.out.println(str); 
		
		str = new Doctor() {
			@Override
			public String demo() {
				//System.out.println("String Annonymous implementation with name....");
				return "String Annonymous implementation without name....";
			}
		}.demo();
		System.out.println(str);
		
		new Test() {
			
			@Override
			public void test1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void test0() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
	}
}

@FunctionalInterface
interface Teachers {
	public abstract void teach();
}

interface Doctor {
	public abstract String demo();
}

interface Test{
	public void test0();
	public void test1();
	
}