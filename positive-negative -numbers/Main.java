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
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		
		int number =sc.nextInt();
		
		
		if(number<0){
		    System.out.println("its a negative number");
		}else{
		    System.out.println("its a positive number");
		}
	}
}
