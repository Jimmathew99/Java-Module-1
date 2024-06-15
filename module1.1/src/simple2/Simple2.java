package simple2;

import java.util.Scanner;

public class Simple2 {

	public static void main(String[] args) {

System.out.println();
System.out.println("Hello");
System.out.println("Jim Mathew");
System.out.println(74+36);
System.out.println(50/3);
System.out.println(-5 + 8 * 6);
System.out.println((55+9) % 9 );
System.out.println(20 + -3*5 / 8 );
System.out.println(5 + 15 / 3 * 2 - 8 % 3);
System.out.println("25x5=125");
System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
System.out.println( 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
System.out.println("J    a   v     v  a");
System.out.println("J   a a   v   v  a a");
System.out.println("J  J  aaaaa   V V  aaaaa");
System.out.println("JJ  a     a   V  a     a");

Scanner scanner=new Scanner(System.in);
System.out.print("Input First Number");
int n1=scanner.nextInt();
//System.out.println(n1);
System.out.print("Input Second Number");
int n2=scanner.nextInt();
int sum=n1+n2;
int sub=n1-n2;
int mul=n1*n2;
int div=n1/n2;
int mod=n1%n2;
System.out.println(n1+"+"+n2+"="+sum);
System.out.println(n1+"+"+n2+"="+sub);
System.out.println(n1+"+"+n2+"="+mul);
System.out.println(n1+"+"+n2+"="+div);
System.out.println(n1+"+"+n2+"="+mod);
Scanner scanner2=new Scanner(System.in);
System.out.println("Input First Number");
int firstNumber=scanner2.nextInt();
System.out.println("Input Second Number");
int secondNumber=scanner2.nextInt();
System.out.println("Before swapping:");
System.out.println("First Number: " + firstNumber);
System.out.println("Second Number: " + secondNumber);

int temp = firstNumber;
firstNumber = secondNumber;
secondNumber = temp;


System.out.println("After swapping:");
System.out.println("First Number: " + firstNumber);
System.out.println("Second Number: " + secondNumber);









	}

}
