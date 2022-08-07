package Day6;

public class CState{
		public static void main(String[] args) {
			CEnumurationState state = CEnumurationState.delhi;
			if(CEnumurationState.valueOf("delhi").equals(state)) {
				System.out.println("If run Successfully....");
			}
			
			switch(state){
				case delhi : {
				System.out.println("Switch run succesfully");
				break;
				}
			}
			
			CEnumurationState[] allState = state.values();
			for(CEnumurationState ces : allState) {
				System.out.println(ces);
			}
			String[] name = {"Arshat" , "Ijas" , "Ashik"};
			String[] allName = name.clone();
			System.out.println(name.hashCode());
			for (String s:allName) {
				System.out.println(s);
			}
		}
	}

