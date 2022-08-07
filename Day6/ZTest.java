package Day6;

public class ZTest {
	public static void main(String[] args) {
		ZTest test = new ZTest();
		test.setName("Arshat");
		System.out.println(test.getName());
		
	}
	private String name;
	private void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}	
}
