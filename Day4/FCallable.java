package Day4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FCallable {
	public static void main(String[] args) {
		
		System.out.println("Main thread Start Teaching....");
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(()->{new Worker1().eatFood();});				//Runnable No return
		
		
//		When we call callable we follow two things
//		1. submit 
//		2. future class
//		es.submit(new MyCallable());
		
		Future<String> future = es.submit(()->{return new Worker2().payBill();});
		try {
		String str = future.get();  //throws Exception
		System.out.println(str);
		}catch(Exception e) {
			
		}
		es.shutdown();
		System.out.println("Main thread Still Teaching....");
	}
}

class Worker1{
	public void eatFood() {
		System.out.println("Eating food....");  
	}
}
class Worker2{
	public String payBill() {
		
		return "Billed payed Sir....";
	}
}

class MyCallable implements Callable<String>{
	@Override
	public String call() throws Exception {
		return null;
	}
	
}
