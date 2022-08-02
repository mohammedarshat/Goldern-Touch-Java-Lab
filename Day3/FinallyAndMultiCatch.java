package Day3;

public class FinallyAndMultiCatch {
	public static void main(String[] args) throws Exception{
		try {
		int i = 1/Integer.parseInt(args[0]);
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("Enter value...");
		}catch(NumberFormatException nfe) {
			System.out.println("Enter Number value....");
		}finally {
			System.out.println("When Exception handled or nor Finally is called....");
		}
	}

}

/**
 * if you pass argument value as String it will show  NumberFormatException
 * if you not pass argument value it is default null then catch ArrayIndexOutOfBoundsException
 * if both catch not catch caption finally run
 * if it catch also finally run
 */
