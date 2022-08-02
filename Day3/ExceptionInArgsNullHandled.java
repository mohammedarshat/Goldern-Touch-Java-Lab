package Day3;

public class ExceptionInArgsNullHandled {

	public static void main(String[] args) {
		System.out.println("..........Berfore Exception..........");
		try {
		System.out.println(args[0]);
		}catch(Exception e) {
			System.out.println("..........Exception Handles Successfully.........");
		}
		System.out.println("..........After Exception..........");

	}

}
