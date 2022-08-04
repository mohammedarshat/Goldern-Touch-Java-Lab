package Day4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EWithRunnable {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(()->{System.out.println("Runnable Child thread Called...");});
//		es.execute(new MyRunnabless());
		es.shutdown();
		System.out.println("Main thread....");
	}

}
class MyRunnabless implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
