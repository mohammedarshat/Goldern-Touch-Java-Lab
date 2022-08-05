package Day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FDeadLock {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Frog frog = new Frog();
		Crane crane = new Crane();
		es.execute(() -> {
			crane.eat(frog);
		});
		es.execute(() -> {
			frog.escape(crane);
		});
		es.shutdown();
		

	}
}

class Crane {
	synchronized public void eat(Frog frog) {
		frog.leaveMe();
	}

	synchronized public void leaveMe() {
		try {
			Thread.sleep(5000);
			
		} catch (Exception e) {

		}
	}

}

class Frog {
	synchronized public void escape(Crane crane) {
		crane.leaveMe();
	}

	synchronized public void leaveMe() {
		try {
			Thread.sleep(5000);
		
		} catch (Exception e) {

		}
	}
}
