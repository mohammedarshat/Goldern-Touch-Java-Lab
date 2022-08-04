package Day4;

//Notes 
//			In this main class i  declare throws exception
//			bcz test 2 i not use try catch it will not handle exception it self thats why i throws exception in test2 meth0od

public class AThreadSleepMainException {
	public static void main(String[] args) throws Exception {
		Thread thread = Thread.currentThread();
		System.out.println("Printing thread function : " + thread);
		test1();
		test2();
		test3();
		test4();
	}
	public static void test1() {
		System.out.println("Test 1 is excecuted..........");
	}
	public static void test2() throws Exception {
		System.out.println("Test 2 is Before Sleep..........");	
		Thread.sleep(5000);
		System.out.println("Test 2 is after Sleep..........");	
	}
	public static void test3() {
		System.out.println("Test 3 is excecuted..........");
	}	
	public static void test4() {
		System.out.println("Test 4 is excecuted..........");
	}	

}

/*
===========================OUTPUT============================
Printing thread function : Thread[main,5,main]
Test 1 is excecuted..........
Test 2 is Before Sleep..........
Test 2 is after Sleep..........
Test 3 is excecuted..........
Test 4 is excecuted..........

*/

