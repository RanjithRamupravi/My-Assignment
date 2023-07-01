package week1.day2;

public class Calculator {
	
	public int addTwoNumbers(int a, int b) {
		return a+b;
	}
	
	public float subTwoNumbers(int c, float d) {
		return d-c;

	}
	
	public int divTwoNumber(int e, int f) {
		return f/e;

	}
	

public static void main(String[] args) {
	Calculator cal = new Calculator ();
	System.out.println(cal.addTwoNumbers(5, 5));
	System.out.println(cal.subTwoNumbers(4, 10.6f));
	System.out.println(cal.divTwoNumber(2, 20));
}
	
}
