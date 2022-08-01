package Day1;

//Notes :

public class Hierarchical {
	public static void main(String[] args) {
		Sub1 obj_B = new Sub1();
		obj_B.print_A();
		obj_B.print_B();
		Sub2 obj_C = new Sub2();
		obj_C.print_A();
		obj_C.print_C();
		Sub3 obj_D = new Sub3();
		obj_D.print_A();
		obj_D.print_D();
	}
}

class Supers {
	public void print_A() {
		System.out.println("Class A");

	}
}

class Sub1 extends Supers {
	public void print_B() {
		System.out.println("Class B");

	}
}

class Sub2 extends Supers {
	public void print_C() {
		System.out.println("Class C");

	}
}

class Sub3 extends Supers {
	public void print_D() {
		System.out.println("Class D");

	}
}
