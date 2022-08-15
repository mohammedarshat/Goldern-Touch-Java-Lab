package Day1;

//Notes :
//1. Child class replace parent but parent cannot replace child
//2. Parent class should be defiinitely declared as abstact
//3. All Business method in the parent class should be declared as final
//4. The Variable don't have overridding concept

public class AbstractExample {
	
	public static void main(String[] args) {
		
		 Attack attack = new Army(); //int cannot override but if u create only for army it will take itself value
		System.out.println(attack.amt);
	}
}

abstract class Attack{
	int amt = 200;
	final public void doAttack(){
		System.out.println("Attack with Guns.....");
	}
}

class Army extends Attack{

//Notes :
//		1. Child class replace parent but parent cannot replace child
//		2. Parent class should be defiinitely declared as abstact
//		3. All Business method in the parent class should be declared as final
//		4. The Variable don't have overridding concept
	
//	 public void doAttack(){ //not work
//			System.out.println("Attack with Guns.....");
//		}

//	4. The Variable don't have overridding concept
		int amt = 100; 
}




