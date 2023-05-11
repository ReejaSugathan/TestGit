package test;

public class Addition 
{
	int sum,num1,num2;
	public Addition(int n1,int n2)
	{
		num1=n1;
		num2=n2;
	}
	public void operation()
	{
		sum=num1+num2;
	}
	public void print()
	{
		System.out.println("NUMBER1 : "+num1);
		System.out.println("NUMBER2 : "+num2);
		System.out.println("RESULT : "+sum);
	}

	public static void main(String[] args) 
	{
		Addition obj=new Addition(10,20);
		obj.operation();
		obj.print();

	}
}
