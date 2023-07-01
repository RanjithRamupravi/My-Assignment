package week1.day1;

public class IsPrime {
	
	public static void main(String[] args) {
		
		int num = 6;
		boolean out = false;
		
		for (int i = 2; i <=num / 2; ++i) {
			
			if (num % i == 0) {
				out = false;
				break;
			}
		}
		
		if (out)
			System.out.println(num+" is a prime number.");
		else
			System.out.println(num+" is not a prime number.");
		
	}

}
