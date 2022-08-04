package Day4;

//Notes: 
//	First main thread execute after only child thread execute
public class BThreadWorkFlows {
	public BThreadWorkFlows() { 															// Debug Flow : 2
		Thread thread = new Thread(new MyRunnables());	 //Child thread						// Debug Flow : 3 and 4
		thread.start();									 									// Debug Flow : 5
	}

	public static void main(String[] args) {
		new BThreadWorkFlows(); 															// Debug Flow : 1
//		try {
//			Thread.sleep(5000);																//Main Thread Intrept means child thread called
//		}catch(Exception e) {
//			
//		}
		
//		Output like be	//Main Thread Intrept means child thread called
//		Runnable Method called....
//		First main thread execute after only child thread execute.......
//		Main thread....
		System.out.println("Main thread....");		 //Main thread	 						// Debug Flow : 6
	}

}

class MyRunnables implements Runnable {
	@Override
	public void run() {
		System.out.println("Runnable Method called...."); 									// Debug Flow : 7
		System.out.println("First main thread execute after only child thread execute.......");
	}

}

/*
===========================OUTPUT============================
Main thread....
Runnable Method called....
First main thread execute after only child thread execute.......

*/