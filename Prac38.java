import java.util.*;
public class Prac38 {
	
	public static void PrintFactorial(int n) {
		
		//Cause we can't calculate negetive factorial
		if(n<0) {
			System.out.println("Invalid input"); 
			return;
		}
		int Factorial = 1;
		for(int a = n; a>=1;a--) {      		//Main Function
			Factorial = Factorial*a;
			
		}
		System.out.println(Factorial);     		
		return;
	}
	public static void main(String[] args) {	//Outer Function
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		PrintFactorial(n);						//calling method
		
	}

}
