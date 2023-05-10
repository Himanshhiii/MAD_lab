/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Rhd A = new Rhd();
		Rd B = new Rd();
		Ld C = new Ld();
		Wd D = new Wd();
		
		
		System.out.println("Readheadduck :");
		A.swim();
		A.fly();
		A.quack();
		
		
		System.out.println("Rubberduck :");
		B.swim();
		B.squeak();
		
		
		System.out.println("Lakeduck :");
		C.swim();
		C.fly();
		C.quack();
		
		
		System.out.println("Woodenduck :");
		D.swim();
		
	}
}
