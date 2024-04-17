class MyThread1 extends Thread
{
	
	public void run()
{     
	
	int i=0;	
 	while(i<5)
{
		System.out.println(" MyThread1 ");
		i++;
}	
	}
}
class Main
{
	public static void main(String args[])
	{
		MyThread1 t1 = new MyThread1();
		
		t1.start();
	
	}
}