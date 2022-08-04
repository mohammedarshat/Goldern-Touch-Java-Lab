package Day4;

//Notes 
//		ExecutorService 
//		MyRunnables class in BThreadWorkFlows.java
//		ExecutorService es = Executors.newFixedThreadPool(1);		//This create a thread
//		MyRunnables class in BThreadWorkFlows.java

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 
public class CExcecutorFrameWork {
	public CExcecutorFrameWork() {
		ExecutorService es = Executors.newFixedThreadPool(1);		//This create a thread
//		es.execute(new MyRunnables()); //To run thread ex.execute		//MyRunnables class in BThreadWorkFlows.java
		es.execute(()->{System.out.println("Lambda Over ride run method CExcecutorFrameWork \"CLASS\"....");});	//MyRunnables class in BThreadWorkFlows.java
		es.shutdown();
	}

	public static void main(String[] args) {
		new CExcecutorFrameWork();
		System.out.println("Main Method of CExcecutorFrameWork....");

	}

}

/*
=============OUTPUT=============

Main Method of CExcecutorFrameWork....
Lambda Over ride run method CExcecutorFrameWork "CLASS"....
*/

/*
=============2nd OUTPUT=============

Runnable Method called....
First main thread execute after only child thread execute.......
Main Method of CExcecutorFrameWork....
Lambda Over ride run method CExcecutorFrameWork "CLASS"....
*/
