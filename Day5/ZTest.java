package Day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZTest {
	public static void main(String[] args) {
		BuildingTest buildingTest = new BuildingTest();
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(() -> {
			Thread.currentThread().setName("Arshat");
			synchronized (buildingTest) {
				buildingTest.toiletTest.useToilet();
				buildingTest.managerTest.useManagerRoom();
			}
		});
		es.execute(() -> {
			Thread.currentThread().setName("Ijas");
			synchronized (buildingTest) {
				buildingTest.toiletTest.useToilet();
				buildingTest.managerTest.useManagerRoom();
			}
		});
		es.shutdown();
	}

}
class BuildingTest{
	ToiletTest toiletTest = new ToiletTest();
	ManagerTest managerTest = new ManagerTest();
}
class ToiletTest {
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
class ManagerTest{
	public void useManagerRoom() {
		
		String name = Thread.currentThread().getName();
		System.out.println(name + " is Entered into Manager Room.....");
		try {
			Thread.sleep(4000);
		}catch(Exception e) {
			
			
		}
		System.out.println(name + " Left from manager Room....");
	}
}
