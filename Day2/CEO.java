package Day2;

public class CEO {

	public static void main(String[] args) {
		CEOS ceos = new Arshat();
		ceos.work();
		CEOS.doReport();
		ceos.food();

	}

}

interface CEOS{
	private void reportToUS() {
		System.out.println("Report to Us....");
	}
	
	private void workForUS() {
		System.out.println("Work For Us....");
	}
	private void giveProfitToUS() {
		System.out.println("Give Profit to Us....");
	}
	default void work() {
		reportToUS();
		workForUS();
		giveProfitToUS();
	}
	static void doReport() {
		System.out.println("Do Report.....");
	}
	public void food();
}

class Arshat implements CEOS{
	@Override
	public void food() {
		System.out.println("I love nort indian Food....");
		
	}
}