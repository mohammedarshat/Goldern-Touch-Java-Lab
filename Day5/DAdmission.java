package Day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DAdmission {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		AdmissionHall nmcc = new AdmissionHall();
		es.execute(()->{
			Thread.currentThread().setName("Arshat");
			nmcc.table1();
			nmcc.table2();
			nmcc.table3();
		});
		es.execute(()->{
			Thread.currentThread().setName("Ijas");
			nmcc.table1();
			nmcc.table2();
			nmcc.table3();
		});
		es.execute(()->{		
			Thread.currentThread().setName("Azeem");
			nmcc.water();
		});
		es.shutdown();
		
	}

}
class AdmissionHall {
	synchronized public void table1() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		System.out.println(name + " is in \"Table 1\"....");
		try { 
			Thread.sleep(3000);
		} catch (Exception e) {

		}
		System.out.println(name + " left from \"Table 1\"....");
	}
	synchronized public void table2() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		System.out.println(name + " is in \"Table 2\"....");
		try { 
			Thread.sleep(3000);
		} catch (Exception e) {

		}
		System.out.println(name + " left from \"Table 2\"....");
	}
	synchronized public void table3() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		System.out.println(name + " is in \"Table 3\"....");
		try { 
			Thread.sleep(3000);
		} catch (Exception e) {

		}
		System.out.println(name + " left from \"Table 3\"....");
	}
	public void water() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		System.out.println(name +" Drink water...");
	}
}
