package Day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CReservationTicket {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		ReservationCounter reservationCounter = new ReservationCounter();
		es.execute(()->{
			Thread.currentThread().setName("Arshat");
			synchronized (reservationCounter) {
				reservationCounter.bookTicket(1000);
				reservationCounter.giveChange();
			}
		});
		es.execute(()->{
			Thread.currentThread().setName("Ijas");
			synchronized (reservationCounter) {
				reservationCounter.bookTicket(500);
				reservationCounter.giveChange();
			}
		});
	}

}

class ReservationCounter{
	int amt ;
	public void bookTicket(int amt) {
		this.amt = amt;
		String name = Thread.currentThread().getName();
		System.out.println(name + " is inside counter.....");
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			
			
		}
		System.out.println(name + " Left from counter....");
	}
	public void giveChange() {
		
		String name = Thread.currentThread().getName();
		System.out.println(name + " is wating for Change.....");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
			
		}
		System.out.println(name + " Left with change : " + (amt-100));
	}
}
