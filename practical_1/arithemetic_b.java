public class arithemetic_b{
	public static void main(String[] args){
		int a = 24;
		int b = 12;
		
		// arithmetic operation

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		// type casting -- widening
		int num = 10;
		double result = num;

		System.out.println();
		System.out.println(num + " integer");
		System.out.println("After conversion to double : " + result);

		// type casting -- Narrowing
		System.out.println("Narrowing");
		
		float n_result = (float) num;
		System.out.println(n_result);

	}
}