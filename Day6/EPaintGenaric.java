package Day6;

public class EPaintGenaric {

	public static void main(String[] args) {
		
		PaintBrush<Paint> pbr = new PaintBrush<>();
		Paint redPaint = new RedPaint();
		pbr.setObj(redPaint);
		Paint pr = pbr.getObj();
		pr.color();
	
		PaintBrush<Paint> pbb = new PaintBrush<>();
		Paint bluePaint = new BluePaint();
		pbb.setObj(bluePaint);
		Paint pb = pbb.getObj();
		pb.color();
		
		PaintBrush<Water> pw = new PaintBrush<>();
		Water water = new Water();
		pw.setObj(water);
		Water pww = pw.getObj();
		pww.water();
		
		PaintBrush<DryAir> pba = new PaintBrush<>();
		DryAir dryAir = new DryAir();
		pba.setObj(dryAir);
		DryAir da = pba.getObj();
		da.dryAir();
	
	}

}
class PaintBrush<T>{
	private T obj;
	public void setObj(T obj) {
		this.obj = obj;
	}
	public T getObj() {
		return obj;
	}
	
}


abstract class Paint{
	public abstract void color();
}
class RedPaint extends Paint{
	@Override
	public void color() {
		System.out.println("Red color paint is painted....");
	}
}
class BluePaint extends Paint{
	@Override
	public void color() {
		System.out.println("Blue color paint is painted....");	
	}
}
class DryAir{
	public void dryAir() {
		System.out.println("DryAir with paintbrush....");
	}
}
class Water{
	public void water() {
		System.out.println("Water is sparked with paintbrush....");
	}
}


