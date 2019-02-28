package javaPractice;

public class Abs1 extends AbsSample {
	
	int result=1;

	@Override
	void fun() {
		// TODO Auto-generated method stub
		System.out.println("Fun printed");
	}

	void fun1()
	{
		System.out.println("Abs1");
		
		}
	
	int factorial (int n)
	
	{
		if (n==1)
		return 1;
		
		result= n*factorial(n-1);
		
		return result ;
	}
	
	public static void main(String[] args) {
		
		AbsSample.fun2();
		
		//AbsSample as = new AbsSample();
		
		Abs1 a = new Abs1();
		
		System.out.println(a.factorial(5));
		
	
	}
	
}
