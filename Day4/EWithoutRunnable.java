package Day4;
//Notes 
//		Working properly

//Printing thread function : Thread[main,5,main] -------------i
//Test 1 is excecuted..........
//Test 3 is excecuted..........
//Test 5 is excecuted..........
//Execute own class without runnable implements....


//remove cmd not work thread properly---------------------------

//Printing thread function : Thread[main,5,main]
//Test 1 is excecuted..........
//Runnable Method called....
//First main thread execute after only child thread execute.......
//Test 2 is Before Sleep..........
//Test 4 is excecuted..........
//arshattt....
//Test 3 is excecuted..........
//Test 5 is excecuted..........
//Execute own class without runnable implements....
//Test 2 is after Sleep..........

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EWithoutRunnable {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("Printing thread function : " + thread);
		test1();
		ExecutorService es = Executors.newFixedThreadPool(2); // This (1) Declare for How many thread
//		es.execute(new MyRunnables()); //in bracket we want declare only runnable implement class 
//		es.execute(() -> {test2();}); // or like this
//		es.execute(() -> {test4();}); // we running child thread in our main class
//		es.execute(() -> {System.out.println("arshattt....");}); // ExcecutorService extend runnable we over wilting
		es.execute(() -> {new Arsh().demo1();});

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



class Arsh {
	public void demo1() {
		System.out.println("Execute own class without runnable implements....");
	}

	public String demo2() {
		return "Expects return value...";
	}

}