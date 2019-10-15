class fibonaci
{
	public static void main(String args)
	{	System.out.println("Printing Fibonacci Series");
		int n1=0,n2=1,n3;
		System.out.println(n1+ "\n "+n2);
		for(int i=2;i<20;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n2=i;
			n1=n3;
		}
	}
}
