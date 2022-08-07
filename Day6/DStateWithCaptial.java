package Day6;

public enum DStateWithCaptial {
	tamilNadu("cheanni"), kerala("tiruvandurapuram"), mumbai("navi mumbai"), goa("vascodagama"), delhi("new delhi"),
	karnataka("bangalore");

	private String capital;

	private DStateWithCaptial(String capital) {
		this.capital = capital;
	}

	public String getCapital() {
		return this.capital;
	}
}
class DemoBeforeEnum {
	public static DemoBeforeEnum tamilnadu = new DemoBeforeEnum("chennai");

	private final String capital;

	private DemoBeforeEnum(String capital) {
		this.capital = capital;
	}

	public static DemoBeforeEnum getTamilnadu() {
		return tamilnadu;
	}

	public String getCapital() {
		return capital;
	}

}

class Main {
	public static void main(String[] args) {
		DStateWithCaptial capital = DStateWithCaptial.tamilNadu;
		switch (capital) {
		case tamilNadu:
			System.out.println(capital.getCapital());
		case kerala:
			System.out.println(capital.getCapital());

		}
		
		DemoBeforeEnum capitalBefore = DemoBeforeEnum.tamilnadu;
		System.out.println(capital.getCapital());
		
		switch (capital) {
		case tamilNadu:
			System.out.println(capital.getCapital());
		case kerala:
			System.out.println(capital.getCapital());

		}
	}
}

