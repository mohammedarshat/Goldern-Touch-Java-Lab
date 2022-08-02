package Day3;
//Important
//			Run As -> Run Configurations -> ArgsFunction(Select class) -> Arguments -> program arguments change number

public class ArgsFunction {

	public static void main(String[] args) {
//		int s = 0;
//		int i = 1/s;
//		int i = 1/Integer.parseInt(args[0]); 1/1 = Output = 1 
		int i = 1/Integer.parseInt(args[0]);	// 1/20 = Output = 0
		System.out.println("1 Divided by Argumet value : " + i);
	}

}
