//Thread

import java.util.*;


class Numbers extends Thread
{
	public void run()

	{
		Scanner sc=new Scanner(System.in);
		int n;
		int i=2;
		System.out.println("enter no");
		n=sc.nextInt();
			
		while(n%i!=0)
		{
			i++;
		}		
		if(n==i)
		{
			System.out.println("Prime no");
		}
		else
		{
			System.out.println("Not a Prime no");
		}
		
	}
}


class primemain
{
	public static void main(String args[])
	{
		Numbers n=new Numbers();
		Thread t1=new Thread(n);
		t1.start();	
	}
}
