class Abc{
	int rnum;
	Abc(int rnum)
	{
		rnum = this.rnum;
	}
	
	boolean equlse(Abc a)
	{
		if(rnum==a.rnum)
		return true;
		else
		return false;		

	}
}
class Main{
		public static void main(String args[])
	{
		Abc r =new Abc(10);
		Abc r2 =new Abc(10);
		System.out.println(r.equals(r2));

	}

}