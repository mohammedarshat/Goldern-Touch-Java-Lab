package Day6;

public class EPaintGenaricWithoutBadWay {
	public static void main(String[] args) {
		BadPaintBresh badPaintBresh = new BadPaintBresh();
		badPaintBresh.doPaint(0);
	
		
		
//		---------------------------COMPILE TIME NO ERROR-----------------------------------
//		---------------------------RUN TIME ERROR------------------------------------------
		
		
//		Water water = new Water();
//		BadPaintBresh1 badPaintBresh1 = new BadPaintBresh1();
//		badPaintBresh1.obj = water;
//		badPaintBresh1.doPaint();
		
//		Exception in thread "main" java.lang.ClassCastException: class Day6.Water cannot be cast to class Day6.Paint (Day6.Water and Day6.Paint are in unnamed module of loader 'app')
//		at Day6.BadPaintBresh1.doPaint(EPaintGenaricWithoutBadWay.java:35)
//		at Day6.EPaintGenaricWithoutBadWay.main(EPaintGenaricWithoutBadWay.java:11)
//		
		DryAir dryair = new DryAir();
		Water water = new Water();
		Paint redpaint = new RedPaint();
		new BadPaintBresh2().doPaint(redpaint);
		new BadPaintBresh2().doPaint(water);
		new BadPaintBresh2().doPaint(dryair);
		
	
	}
}
class BadPaintBresh{
	public void doPaint(int num) {
		if(num == 0) {
			System.out.println("Blue paint...");
		}else if(num == 1) {
			System.out.println("Red paint...");
		}
	}
}
class BadPaintBresh1{
	Object obj;
	public void doPaint() {
		Paint paint = (Paint)obj;
	}
}
class BadPaintBresh2{
	Object obj;
	public void doPaint(Object obj) {
		if(obj instanceof Paint) {
			Paint paint = (Paint)obj;
			paint.color();
		}else if(obj instanceof Water) {
			Water water = (Water)obj;
			water.water();
		}
		else if(obj instanceof DryAir) {
			DryAir dryAir = (DryAir)obj;
			dryAir.dryAir();
		}
	}
}
