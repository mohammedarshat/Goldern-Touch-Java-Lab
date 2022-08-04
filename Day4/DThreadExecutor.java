package Day4;
//Note
//	   Working Properly


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DThreadExecutor {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("Printing thread function : " + thread);
		test1();
		ExecutorService es = Executors.newFixedThreadPool(1); // This (1) Declare for How many thread
//		es.execute(new MyRunnables()); //in bracket we want declare only runnable implement class 
		es.execute(() -> {test2();}); // or like this 
	
		es.shutdown();
		test3();
		test5();
	}

	public static void test1() {
		System.out.println("Test 1 is excecuted..........");
	}

	public static void test2() {
		System.out.println("Test 2 is Before Sleep..........");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
		System.out.println("Test 2 is after Sleep..........");
	}

	public static void test3() {
		System.out.println("Test 3 is excecuted..........");
	}

	public static void test4() {
		System.out.println("Test 4 is excecuted..........");
	}
	public static void test5() {
		System.out.println("Test 5 is excecuted..........");
	}

}


/*
=============OUTPUT=============

Printing thread function : Thread[main,5,main]
Test 1 is excecuted..........
Test 3 is excecuted..........
Test 5 is excecuted..........
Test 2 is Before Sleep..........
Test 2 is after Sleep..........


*/


/*
=============2nd OUTPUT=============

Printing thread function : Thread[main,5,main]
Test 1 is excecuted..........
Runnable Method called....
First main thread execute after only child thread execute.......
Test 3 is excecuted..........
Test 5 is excecuted..........
Test 2 is Before Sleep..........
Test 2 is after Sleep..........


*/




	
