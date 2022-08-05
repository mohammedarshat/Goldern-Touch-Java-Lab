package Day5;
//Note :
//	Method synchronized is use for we want to use both method parellay we use method lock best example table admission in this program we use
// 	wait method it is used to enter another thread 
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EGunWaitNotify {
	public static void main(String[] args) {
		Gun bofors = new Gun();
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(()->{
			for(int i = 0 ; i != 5 ; i++ ) {
				bofors.loadGun();
			}
		});
		es.execute(()->{
			for(int i = 0 ; i != 5 ; i++ ) {
				bofors.shootGun();
			}
		});
		es.shutdown();
	
	}
		
}

class Gun{
	boolean flag;	//false
	synchronized public void loadGun() {	//Why we using synchronized means for thread not want to collops
		if(flag) {	//This is loop function don't forget that first
			try {
				wait();	//wait is used to enter the another thread parellay
			}catch(Exception e) {
				
			}
		}
		System.out.println("Fill the Gun....");
		flag = true;
		notify(); //i used to wake up
	}
	synchronized public void shootGun() {
		if(!flag) {
			try {
				wait();
			}catch(Exception e) {
				
			}
		}
		System.out.println("Shoot the Gun....");
		flag = false;
		notify();
	}
}
