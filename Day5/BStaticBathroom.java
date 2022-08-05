package Day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Note
//	Last one this one same output
//	but this is diffrent from last program
//	last program 1 builing 1 bathrom
//	this time 2 building 1 bathroom

public class BStaticBathroom {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Buildingesst buildingesst = new Buildingesst();
		Buildingesst buildingesst1 = new Buildingesst();
		Thread thread = Thread.currentThread();

		es.execute(() -> { 
			Thread.currentThread().setName("Arshat");
//			synchronized (buildingest.toiletest) { 
			buildingesst.managerst.useMagerRoom();
				synchronized (Buildingesst.class) {
					Buildingesst.toiletesst.useToilet();
				
			}
		});
		es.execute(() -> {
			Thread.currentThread().setName("Ijas");
//			synchronized (buildingest1.toiletest) {
			buildingesst.managerst.useMagerRoom();
				synchronized (Buildingesst.class) {
					Buildingesst.toiletesst.useToilet();
			
			}
		});
		
		es.shutdown();
	}

}

class Buildingesst {
	static Toiletesst toiletesst = new Toiletesst();
	Managerst managerst = new Managerst();
}

class Toiletesst {
	public void useToilet() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		System.out.println(name + " is inside the Toilet....");
		try { 
			Thread.sleep(5000);
		} catch (Exception e) {

		}
		System.out.println(name + "  is get out of from Toilet....");
	}
}
class Managerst{
	public void useMagerRoom() {
		
		String name = Thread.currentThread().getName();
		System.out.println(name + " is Entered into Manager Room.....");
		try {
			Thread.sleep(4000);
		}catch(Exception e) {
			
		}
		System.out.println(name + " Left from manager Room....");
	}
}
