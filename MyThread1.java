
package com.Basic500;

public class  MyThread1 implements  Runnable
{
public static void main(String[]args) {
			MyThread1 t1=new MyThread1();
	//t1.run();is wrong way does not create a new thread
	//correct way -create a new thread 		
			Threads2 t2=new Threads2();
         t1.start();
         t2.start();
}
public void run()
{
	for(int i=1;i<=100;i++)
	{
		try {
			System.out.print(i+" ");
			sleep(100);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	}
}
