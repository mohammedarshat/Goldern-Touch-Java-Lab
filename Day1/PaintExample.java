package Day1;

public class PaintExample {
	
	public static void main(String[] args) {
		Paint p = new RedPaint();
		p.m1();
		
//		RedPaint rp = new RedPaint();
//		rp.m1();
	}
}

abstract class Paint{
	public Paint() {
		System.out.println("Hai arshat you called abs constarct.....");
	}
	public Paint(int i) {
		System.out.println("Hai arshat you called 2 constarct.....");
	}
	
//	3. All Business method in the parent class should be declared as final
	public void m1(){ //Worng it shoube be final
		System.out.println("m1");
	}
}
class RedPaint extends Paint{

	
	@Override
	public void m1(){ 
		System.out.println("Override");
	}
	
}

	
