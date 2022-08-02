package Day3;

import java.io.FileInputStream;

public class ExceptionInFile {

	public static void main(String[] args) throws Exception{
		System.out.println("..........Berfore Exception.........");
		FileInputStream file = new FileInputStream("Arshat.txt");   //it is throws Exception
		System.out.println("..........Berfore Exception........."); //Compile time error
		

	}

}
/*
			Output
	
==================================
	
..........Berfore Exception.........
Exception in thread "main" java.io.FileNotFoundException: Arshat.txt (The system cannot find the file specified)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
	at Day3.ExceptionInFile.main(ExceptionInFile.java:9)
**/
