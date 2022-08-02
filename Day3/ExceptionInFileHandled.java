package Day3;

import java.io.FileInputStream;

public class ExceptionInFileHandled {

	public static void main(String[] args)throws Exception{
		System.out.println("..........Berfore Exception.........");
		try {
		FileInputStream file = new FileInputStream("Arshat.txt"); 	//New -> File -> enter name.ext file will create
		}catch(Exception e) {
			System.out.println("..........Exception Handles Successfully.........");
		}//it is throws Exception
		System.out.println("..........Berfore Exception........."); //Compile time error
		
		try {
			FileInputStream file = new FileInputStream("Arshat.txt"); 	
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("..........Berfore Exception........."); 
	}

}

/*
			Output

==================================

..........Berfore Exception.........
..........Exception Handles Successfully.........
..........Berfore Exception.........
java.io.FileNotFoundException: Arshat.txt (The system cannot find the file specified)
..........Berfore Exception.........
**/
