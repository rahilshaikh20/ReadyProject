package javaPractice;

public class Abs1 extends AbsSample {
	
	int result=1;


	void fun2() {
		// TODO Auto-generated method stub
		System.out.println("Fun from child printed");
	}
	
	void fun1() {
		// TODO Auto-generated method stub
		System.out.println("Abs1 printed");
	}

	void fun() {
		// TODO Auto-generated method stub
		System.out.println("Fun printed");
	}
	
	void func()
	{
		super.fun2();
	}
	
	int factorial (int n)
	
	{
		if (n==1)
		return 1;
		
		result= n*factorial(n-1);
		
		return result ;
	}
	
	public static void main(String[] args) {
		
		//AbsSample.fun2();
		
		//AbsSample as = new AbsSample();
		
		AbsSample a = new Abs1();
		//AbsSample b =new AbsSample() ;
		Abs1 b = new Abs1();
		
		
		a.fun2();
		b.func();
		
		//b.fun1();
		//System.out.println(a.factorial(5));
		
	
	}
	
}
