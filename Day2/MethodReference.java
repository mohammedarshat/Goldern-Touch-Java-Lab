package Day2;

public class MethodReference {
	public static void main(String[] args) {
		Demo demo = MethodReference::test1;
		demo.test0();
		
		MethodReference mr = new MethodReference();
		Demo1 demo1 = mr::test2;//main point we not use c bracte when we refrence		
		demo1.test3();
		
		Demo1 demo2 = new MethodReference()::test2;
		demo2.test3();
		
	}
	public static void test1() {
		System.out.println("Method reference done suceesfully....");
	}
	public void test2() {
		System.out.println("Method refence 2 run succesfullu....");
	}
}

@FunctionalInterface
interface Demo{
	public abstract void test0();
}
@FunctionalInterface
interface Demo1{
	public abstract void test3();
}