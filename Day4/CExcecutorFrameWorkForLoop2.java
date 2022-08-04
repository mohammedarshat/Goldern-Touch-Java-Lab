package Day4;

//Notes :
//		Output notes in day4 java note it is bcz of io details refer note

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CExcecutorFrameWorkForLoop2 {
	public static void main(String[] args) {
		ExecutorService ess = Executors.newFixedThreadPool(1); // This create a thread
//		es.execute(new MyRunnables()); //To run thread ex.execute		//MyRunnables class in BThreadWorkFlows.java
		ess.execute(() -> {	System.out.println("Lamda Over ride run method CExcecutorFrameWork \"CLASS\"....");}); // MyRunnables class in BThreadWorkFlows.java
		ess.shutdown();
		for(int i = 0 ; i < 3 ; i++) {//		Output notes in day4 java note it is bcz of io details refer note
//												IO Intrept main thread intrept
			System.out.println("Main Mthod of CExcecutorFrameWork  Answer Change : " + i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}
