package Day6;

public class DStateWithCaptalClassPrint {
	public static void main(String[] args) {
		DStateWithCaptial state = DStateWithCaptial.delhi;
		if(DStateWithCaptial.valueOf("delhi").equals(state)) {
			System.out.println("If run Successfully.... " + state.getCapital());
		}
		
		switch(state){
			case delhi : {
			System.out.println("Switch run succesfully....  " + state.getCapital());
			break;
			}
		}
		
		DStateWithCaptial[] allState = state.values();
		for(DStateWithCaptial ces : allState) {
			System.out.println(ces + " : " + ces.getCapital());
		}
		String[] name = {"Arshat" , "Ijas" , "Ashik"};
		String[] allName = name.clone();
		System.out.println(name.hashCode());
		for (String s:allName) {
			System.out.println(s);
		}
	}
}
