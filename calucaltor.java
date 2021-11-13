package testing;

public class calucaltor {
	public int add (int a,int b)
	{
		int sum = a+b;
		return sum;
	}
	public int sub (int a,int b)
	{
		int sub = a-b;
		return sub;
	}
	public long mul (int a,int b)
	{
		int mul = a*b;
		return mul;
	}
	public double div (int a,int b)
	{
		double div = a/b;
		return div;
	}

	public static void main(String[] args) {
		calucaltor c = new  calucaltor();
		int a = c.add(10, 20);
		System.out.println("addition of two numbers is :"+a);
		int b = c.sub(50, 20);
		System.out.println("subtraction  of two numbers is :"+b);
		long c1 = c.mul(10, 20);
		System.out.println("multipication of two numbers is :"+c1);
		double d = c.div(80, 20);
		System.out.println("division of two numbers is :"+d);
	}
	}
		
	/*	
		char operator;
		double n1,n2;
		Scanner input =new Scanner(System.in);
		System.out.println("enter the operator (+,-,*,/)");
		operator = input.next().charAt(0);
		System.out.println("enter the number one by one ");
		n1=input.nextDouble();
		n2=input.nextDouble();
		input.close();
		switch(operator){
		case '+':
		System.out.printf("%f+%f =%f",n1,n2,(n1+n2));
		 break;
		case '-':	
		System.out.printf("%.2f+%.2f =%.2f",n1,n2,(n1-n2));
		break;
		case '*':
		System.out.printf("%.2f+%.2f =%.2f",n1,n2,(n1*n2));
		break;
		case '/':
		if(n1!=0)
			System.out.printf("%.2f+%.2f=%.2f", n1,n2,(n1/n2));
		else
			System.out.printf("%.2f+%.2f=%.2f", n1,n2,(n1+n2));
		break;
		}
}
	}
*/