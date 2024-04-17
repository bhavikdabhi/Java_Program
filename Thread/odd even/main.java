class MyThread extends Thread
{
	private int number;

	public MyThread(String name, int pnum)
	{
		super(name);
		this.number = pnum;
	}
	
	public void run()
{    
	for(int i = 0; i <25;i++)
	{
		System.out.println(getName()+ this.number);
		this.number +=2;
		
	} 	
}}
class Main
{
	public static void main(String args[])
	{
		MyThread t1 = new MyThread("ODD",1);
		MyThread t2 = new MyThread("EVEN",2);
		t1.start();
		t2.start();
}}