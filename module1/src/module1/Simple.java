package module1;

public class Simple {

	public static void main(String[] args) {
		// Unary Operators 
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
		int a=10;  
		int b=10;  
		System.out.println(a++ + ++a);//10+12=22  
		System.out.println(b++ + b++);//10+11=21  
		boolean c=true;
		System.out.println(!c);// False inverting the value of a boolean
		// Arithmetic Operators
		int p=15;
		int l=12;
		System.out.println(p+l);
		System.out.println(p-l);
		System.out.println(p*l);
		System.out.println(p/l);
		System.out.println(p%l);
		System.out.println(10*10/5+3-1*4/2); 
		// Java Left Shift Operators
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240  
		// Java Right Shift Operators
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2  
		//Java AND Operator Example: Logical && and Bitwise &
		//The logical && operator doesn't check second condition if first condition is false. 
//		It checks second condition only if first one is true.
//The bitwise & operator always checks both conditions whether first condition is true or false.
		int k=10;  
		int f=5;  
		int m=20;  
		System.out.println(k<f&&k<m);//false && true = false  
		System.out.println(k<f&k<m);//false & true = false 
		// 06/15/2024 Control Statements
		// If Statement example
		int age =18;
		if(age<15) {System.out.println("Age is less than 18");}
		

	}

}
