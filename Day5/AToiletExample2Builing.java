package Day5;

//Note :
//		This program 100 persentage correct 
//		next time you see this program that time you think this is wrong
//		understand the concept firt then u say it write
//		remember in this program am using 2 building 2 toilet
//		last program 1 building 1 toilet

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Note :
//		Day 4 continue 
//		Day 4 we see One building
//		now we seeing 2 building
		
public class AToiletExample2Builing {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Buildinge buildinge = new Buildinge();
		Buildinge buildinge1 = new Buildinge();
		Thread thread = Thread.currentThread();

		es.execute(() -> { 
			Thread.currentThread().setName("Arshat");
//			synchronized (buildinge.toilete) { 
				synchronized (buildinge) {
				buildinge.toilete.useToilet();
			}
		});
		es.execute(() -> {
			Thread.currentThread().setName("Ijas");
//			synchronized (buildinge1.toilete) {
				synchronized (buildinge1) {
				buildinge1.toilete.useToilet();
			}
		});
		
		es.shutdown();
	}

}

class Buildinge {
	Toilete toilete = new Toilete();
}

class Toilete {
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
