package com.Basic500;

public class Threads2 extends Thread
	{
		public void run()
		{
			for(int i=100;i>=1;i--)
			{
				try {
					System.out.print(i+" ");
					sleep(100);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	
	
		
		

	


