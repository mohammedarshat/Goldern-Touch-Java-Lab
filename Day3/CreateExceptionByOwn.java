package Day3;

public class CreateExceptionByOwn {

	public static void main(String[] args)throws Exception {
		
		Exam exam = new Exam();
		exam.writeExam("examhallticket");
		try {
			exam.writeExam("aa");
		}catch(HallticketException h) {
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

class Exam{
	public void writeExam(String hallTicket)throws Exception {
		if(hallTicket == null) {
			throw new Exception();
		}else if(hallTicket.equalsIgnoreCase("ExamHallTicket")) {
			System.out.println("Allow for write Exam....");
		}else if(!hallTicket.equals("a")) {
			throw new HallticketException("Invalid Hall Ticket....");
		}	
	}
}

class HallticketException extends Exception{
	String msg ;
	public HallticketException(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		// toString Is used to custom statement....
		return "Exception in................ : " + this.msg;
	}
}
