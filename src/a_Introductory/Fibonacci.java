package a_Introductory;

public class Fibonacci {
	public int fib(int n) {
		switch (n) {
			case 0: return 0;
			case 1: return 1;
			default: return (fib(n - 1) + fib(n - 2));
		}
	}
}

//we had:  default: return (fib(n - 1) + fib(n - 2)) + 1;
//The error was in '+ 1' is causing an increment by 1 in every recursive call, which is not correspond to the Fibonacci sequence calculation.