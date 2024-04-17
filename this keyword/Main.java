class Abc
{
	  int a;
	Abc(int a)
	{
		a = this.a;
	}
	/*void showdata()
	{
		System.out.println(a);
	}*/
}
class Main
{
	public static void main(String args[])
	{
		Abc ob =new Abc(10);
		System.out.println(ob.a);
		
	}


}