package Day4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GExecuteServiceObjectLock {

	public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		Building building = new Building();
		Thread thread = Thread.currentThread();

		es.execute(() -> {
			Thread.currentThread().setName("Arshat");
			synchronized (building.toilet) {
				building.toilet.useToilet();
			}
		});
		es.execute(() -> {
			Thread.currentThread().setName("Ijas");
			synchronized (building.toilet) {
				building.toilet.useToilet();
			}
		});
		
		es.shutdown();
		
	}

}

class Building {
	Toilet toilet = new Toilet();
}

class Toilet {
	public void useToilet() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		System.out.println(name + " he is inside the Toilet....");
		try { 
			Thread.sleep(5000);
		} catch (Exception e) {

		}
		System.out.println(name + " he is get out of from Toilet....");
	}
}
