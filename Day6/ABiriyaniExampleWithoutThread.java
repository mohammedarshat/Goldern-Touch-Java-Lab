package Day6;

//Note
//	Without Thread it take to lot of time to process
//	it is parallel program we use thread to achive
//	Nest program we see using thread it will run and execute quiqly

public class ABiriyaniExampleWithoutThread {

	public static void main(String[] args) {
		System.out.println("Note\r\n"
				+ "	Without Thread it take to lot of time to process\r\n"
				+ "	it is parallel program we use thread to achive "
				+ "Nest program we see using thread it will run and execute quiqly \n\n"
				+ "\tRun Time \"37 : Secound\"\n\n");
		
//		MakeBiriyani makeBiriyani = new MakeBiriyani();
		new MakeBiriyani().makeBiriyani();
	}

}
class MakeBiriyani {
	public void makeBiriyani() {
		new VegCut().vegCut();
		new CookRice().cookRice();
		new CookCurry().cookCurry();
		new MixAndMakeBiriyani().mixMasala();

	
	}	
}

class CookRice{
	 public void cookRice() {
			Thread thread = Thread.currentThread();
			String name = thread.getName();
			System.out.println(name + " is inside a kitchen to \"Cook Rice\"....");
			try { 
				Thread.sleep(5000);
			} catch (Exception e) {

			}
			System.out.println(name + " is lest from kitchen \"Rice is Ready\"....");
		}
}
class VegCut{
	 public void vegCut() {
			Thread thread = Thread.currentThread();
			String name = thread.getName();
			System.out.println(name + " is inside a kitchen to \"Cut Vegitable\"....");
			try { 
				Thread.sleep(4000);
			} catch (Exception e) {

			}
			System.out.println(name + " is lest from kitchen \"Vegitable is Ready\"....");
		}
}
class CookCurry{
	 public void cookCurry() {
			Thread thread = Thread.currentThread();
			String name = thread.getName();
			try { 
				Thread.sleep(6000);
			} catch (Exception e) {

			}
			System.out.println(name + " is inside a kitchen to \"Make Curry\"....");
			try { 
				Thread.sleep(5000);
			} catch (Exception e) {

			}
			System.out.println(name + " is lest from kitchen \"Curry is Ready\"....");
		}
}
class MixAndMakeBiriyani{
	 public void mixMasala() {
			Thread thread = Thread.currentThread();
			String name = thread.getName();
			try { 
				Thread.sleep(11000);
			} catch (Exception e) {

			}
			System.out.println(name + " is inside a kitchen to \"Mix And Make Biriyan\"....");
			try { 
				Thread.sleep(5000);
			} catch (Exception e) {

			}
			System.out.println(name + " is lest from kitchen \"Biriyani is Ready\"....");
		}
}