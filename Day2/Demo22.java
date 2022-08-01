package Day2;

public class Demo22 {

	public static void main(String[] args) {
		Demo22 demo22 = new Demo22();
		Demo11 demo11 = demo22::test1;
		demo11.test0();
		
		demo11 = new Demo22()::test1;
		demo11.test0();
	}
	public void test1() {
		System.out.println("Methodn refrence test1 to test0 sucessfully....");
	}
}

@FunctionalInterface
interface Demo11{
	public abstract void test0();
}

