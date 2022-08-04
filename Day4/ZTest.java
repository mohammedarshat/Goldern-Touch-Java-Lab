package Day4;

public class ZTest {
	public ZTest() {							//Debug Flow : 2
			Thread thread = new Thread(new MyRunnable());	//Debug Flow : 3 and 4
			thread.start();									//Debug Flow : 5
			
	}
	public static void main(String[] args) {
		new ZTest();							//Debug Flow : 1
		System.out.println("Main thread....");	//Debug Flow : 6
	}

}
class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("Runnable Method called....");	//Debug Flow : 7
	}
}
