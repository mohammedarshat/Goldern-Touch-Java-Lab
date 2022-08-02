package Day3;

import java.io.FileInputStream;

public class FileRead {

	public static void main(String[] args) throws Exception {
		System.out.println("..........Berfore Exception.........");
		FileInputStream file = new FileInputStream("Ijas.txt");   //it is throws Exception
		System.out.println("..........Berfore Exception........."); //Compile time error
		

	}

}


/*
Output

==================================

..........Berfore Exception.........
..........Berfore Exception.........
**/