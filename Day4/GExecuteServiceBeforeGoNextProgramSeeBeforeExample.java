package Day4;

//Notes:
//	Before object lock
//	before synconization

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GExecuteServiceBeforeGoNextProgramSeeBeforeExample {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Buildings building = new Buildings();
		Thread thread = Thread.currentThread();

		es.execute(() -> {
			Thread.currentThread().setName("Arshat");
			
				building.toilet.useToilet();
		
		});
		es.execute(() -> {
			Thread.currentThread().setName("Ijas");
			
				building.toilet.useToilet();
			
		});

		es.shutdown();

	}
}

class Buildings {
	Toilets toilet = new Toilets();
}

class Toilets {
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

/*
===============OUTPUT=======================

Arshat he is inside the Toilet....
Ijas he is inside the Toilet....
Ijas he is get out of from Toilet....
Arshat he is get out of from Toilet....
*/