package Day2;

public class AnnonymousInterface {
	public static void main(String[] args) {
		new Teacher() {
			@Override
			public void demo() {
				System.out.println("Annonymous........");
			}
		}.demo();
		
		Teacher teacher = new Teacher() {
			@Override
			public void demo() {
				System.out.println("Non Annonymous........");
			}
		};
		teacher.demo();
		
		Student student = new Student() {
			@Override
			public String demo1() {
				return "Arshat Demo = 0";
			}
		};
		String str = student.demo1();
		System.out.println(str);
		
		str = new Student() {
			
			@Override
			public String demo1() {
				return "String Annonymous 2....";
			}
		}.demo1();
		
		System.out.println(str);
	}
}

interface Teacher{
	public void demo();
}

interface Student{
	public String demo1();
}