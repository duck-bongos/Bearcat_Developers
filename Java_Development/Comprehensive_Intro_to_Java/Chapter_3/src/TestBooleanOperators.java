import java.util.Scanner; 


public class TestBooleanOperators {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//test boolean operators: 
		// "!" means "not"
		// "&&" means "and"
		// "||" means "or"
		// "^" means "exclusive or"
		
		System.out.print("Enter an integer: ");
		int num = in.nextInt();
		
		if (num % 2 == 0 && num % 3 ==0)
			System.out.println(num + " is divisible by 2 and 3.");
		
		if (num % 2 == 0 || num % 3 == 0)
			System.out.println(num + " is divisible by 2 or 3.");
		
		if (num % 2 == 0 ^ num % 3 == 0)
			System.out.println(num + "is divisible by 2 or 3, but not both.");
		
	}
}