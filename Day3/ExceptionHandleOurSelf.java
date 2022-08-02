package Day3;

public class ExceptionHandleOurSelf {
	public static void main(String[] args) {
		
//		System.out.println(args[0]);
		
		int i = Integer.parseInt(args[0]);
		if(args.length != 0) {
			String s = args[0];
			char c = s.charAt(0);
//			System.out.println(c);
			System.out.println("Checking this method : " +Character.isDigit(c));
			if(Character.isDigit(c)) { // AAA is not a digit false , 1 is a digit trur run
				if(i != 0) {
					int k = 1/i;
					System.out.println(k);
				}
				else {
					System.out.println("Enter the non zero value....");
				}
			}
			else {
				System.out.println("Enter the number value....");
			}
		}	
		else {
			System.out.println("Enter the value.....");	
		}
		
	}

}
