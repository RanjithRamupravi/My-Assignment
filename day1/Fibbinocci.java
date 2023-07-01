package week1.day1;

public class Fibbinocci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int sum = 0;
		
		System.out.println(a+" \n"+b);
		
		for (int i=1; i<=7; i++) {
			
			sum = a + b;
			a = b;
			b = sum;
			System.out.println(sum);
						
		}
		
	}

}
