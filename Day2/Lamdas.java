package Day2;


public class Lamdas {

	public static void main(String[] args) {
		DemoLamda dl = () -> {System.out.println("Lamda create Successfully....");};
		dl.test0();
		
		LamdaString ls = () -> {return "Lamda Return Successfully....";};
		System.out.println(ls.test1());
		
		LamdaParameter lp = (name , number) -> {System.out.println("Paramenter passing number = " + number);return "lamda parameter run successfully....";};
		System.out.println(lp.test2("Arshat",1));
		
		//Employee emp = new Employee();
		//ComplexLamda cl = (employee , name , number) -> {System.out.println("Name of the Employee : " + name + "\nRank of the Employee : " + number + "\nEmployee :" + employee);return emp;};
		ComplexLamda cl = (employee , name , number) -> {System.out.println("Name of the Employee : " + name + "\nRank of the Employee : " + number + "\nEmployee : " + employee);return new Employee();};
		System.out.println(cl.test3(new Employee(), "Mohammed Arshat", 2));//this new diffrent obj address
	}
}

@FunctionalInterface
interface DemoLamda {
	public abstract void test0();
}

@FunctionalInterface
interface LamdaString{
	public abstract String test1();
}

@FunctionalInterface
interface LamdaParameter{
	public abstract String test2(String name,int number);
}

class Employee{
//	public void demo10() {
//		System.out.println("Employee method.....");
//	}
//	
}

@FunctionalInterface
interface ComplexLamda{
	public abstract Employee test3(Employee emp , String name , int number);
}