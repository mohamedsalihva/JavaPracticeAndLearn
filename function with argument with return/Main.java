/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
		System.out.println("enter two number");
		
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
	int	result=sum(num1,num2);
	
	System.out.println("result"+result);
		
		
		
	}
	
  static	int sum(int a, int b){
	    int c=a+b;
	    return c;
	}
}
