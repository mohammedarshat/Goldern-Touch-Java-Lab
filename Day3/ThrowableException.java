package Day3;


public class ThrowableException {

	public static void main(String[] args)throws Throwable {
		
		Exams exam = new Exams();
		exam.writeExam("examhallticket");
		try {
			exam.writeExam("aa");
		}catch(HallticketExceptions h) {
			System.out.println("HallTicketException....");
		}
		try {
			exam.writeExam(null);
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			exam.writeExam(null);
		}catch(Exception e) {
//			e.printStackTrace();
		System.out.println("Exception Handled Successfully....");
		}
		exam.writeExam("aa");
	}

}

class Exams{
	public void writeExam(String hallTicket)throws Throwable {
		if(hallTicket == null) {
			throw new Exception();
		}else if(hallTicket.equalsIgnoreCase("ExamHallTicket")) {
			System.out.println("Allow for write Exam....");
		}else if(!hallTicket.equals("a")) {
			throw new HallticketExceptions("Invalid Hall Ticket....");
		}	
	}
}

class HallticketExceptions extends Throwable{
	String msg ;
	public HallticketExceptions(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		// toString Is used to custom statement....
		return "Exception in................ : " + this.msg;
	}
}

