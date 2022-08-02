package Day3;

public class MadmanExceptionHandlingTryCatch {
	public static void main(String[] args) throws Exception{
		MadMan madman = new MadMan();
		madman.play("biscate");
		System.out.println("...........Before Exception...........");
		try {
			madman.play("Stick");
		}
		catch(Exception e) {
			System.out.println("Exception handled Suceesfully....");
		}
		System.out.println("After Exception Hanling with tey catch....");
	}
}

class MadMan{
	public String play(String item) throws Exception {
		if(item.equals("Stick")) {
			throw new Exception();
		}else if(item.equals("Stone")) {
			throw new Exception();

		}else if(item.equals("biscate")) {
			System.out.println("Dog is vey much Happy.....");
		}
		return null;
	}
}
