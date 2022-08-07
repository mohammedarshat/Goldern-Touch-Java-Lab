package Day6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BBiriyaniExampleWithThread {
	public static void main(String[] args) {
		System.out.println(
						"\t  RUN TIME COMPARISION BETWEEN TWO PROGRAM\n\n" 
						+ "\t This Program  Run Time \"21 : Secound\"\n"
						+ "\t ABiriyaniExampleWithoutThread Run Time \"37 : Secound\"\n\n"
						);
		new MakeBiriyaniTest().makeBiriyani();
	}

}

class MakeBiriyaniTest {

	public void makeBiriyani() {

		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(() -> {
			Thread.currentThread().setName("Arshat");
			new CookRiceTest().cookRice();
		});
		es.execute(() -> {
			Thread.currentThread().setName("Ijas");
			new VegCutTest().vegCut();
		});
		es.execute(() -> {
			Thread.currentThread().setName("Abitha");
			new CookCurryTest().cookCurry();
		});
		es.execute(() -> {
			Thread.currentThread().setName("Ansila");
			new MixAndMakeBiriyaniTest().mixMasala();
		});
		es.shutdown();

	}
}

class CookRiceTest {
	public void cookRice() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		System.out.println(name + " is inside a kitchen to \"Cook Rice\"....");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
		System.out.println(name + " is left from kitchen \"Rice is Ready\"....");
	}
}

class VegCutTest {
	public void vegCut() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		System.out.println(name + " is inside a kitchen to \"Cut Vegitable\"....");
		try {
			Thread.sleep(4000);
		} catch (Exception e) {

		}
		System.out.println(name + " is left from kitchen \"Vegitable is Ready\"....");
	}

}

class CookCurryTest {
	public void cookCurry() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
		System.out.println(name + " is inside a kitchen to \"Make Curry\"....");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
		System.out.println(name + " is left from kitchen \"Curry is Ready\"....");
	}
}

class MixAndMakeBiriyaniTest {
	public void mixMasala() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		try {
			Thread.sleep(11000);
		} catch (Exception e) {

		}
		System.out.println(name + " is inside a kitchen to \"Mix And Make Biriyan\"....");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
		System.out.println(name + " is left from kitchen \"Biriyani is Ready\"....");
	}
}

/**
 * =============Output=========
 * 
 * Arshat is inside a kitchen to "Cook Rice"....
 * Ijas is inside a kitchen to "Cut Vegitable".... 
 * Ijas is left from kitchen "Vegitable is Ready".... 
 * Arshat is left from kitchen "Rice is Ready".... 
 * Abitha is inside a kitchen to "Make Curry".... 
 * Abitha is left from kitchen "Curry is Ready".... 
 * Ansila is inside a kitchen to "Mix And Make Biriyan".... 
 * Ansila is left from kitchen "Biriyani is Ready"....
 */
