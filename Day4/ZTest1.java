package Day4;

public class ZTest1 {

	public static void main(String[] args) {
		Human human = new Arshat();
		Azeem Azeem = new Azeem();
		Thread thread = new Thread(new Azeem());
		thread.start();
	}

}

abstract class Human{
	abstract public void test1();
}
class Arshat extends Human{
	@Override
	public void test1() {
		System.out.println("Override method...");
	}
}
class Azeem implements Runnable{
	@Override
	public void run() {
		System.out.println("Runnable Method called....");
	}
	public void r() {
		System.out.println("Runnable Method called....");
	}
}