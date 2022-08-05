package Day5;

//Note :
//		This is one building

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BManagerRoomExample {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Buildinges buildinges = new Buildinges();
//		Buildinges buildinges1 = new Buildinges();
		Thread thread = Thread.currentThread();

		es.execute(() -> { 
			Thread.currentThread().setName("Arshat");
//			synchronized (buildinge.toilete) { 
			buildinges.manager.useMagerRoom();
				synchronized (buildinges) {
				buildinges.toiletes.useToilet();
//				buildinges.manager.useMagerRoom();
				
			}
		});
		es.execute(() -> {
			Thread.currentThread().setName("Ijas");
//			synchronized (buildinge1.toilete) {
			buildinges.manager.useMagerRoom();
				synchronized (buildinges) {
				buildinges.toiletes.useToilet();
				
			
			}
		});
		
		es.shutdown();
	}

}

class Buildinges {
	Toiletes toiletes = new Toiletes();
	Manager manager = new Manager();
}

class Toiletes {
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
class Manager{
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
