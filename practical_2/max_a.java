public class max_a{
	public static void main(String[] args){
		int a = 10;
		int b = 23;
		int c = 112;
		
		// using logical operator
		if (a > b && a > c){
			System.out.println("A is Max");
		}
		else if (b > a && b > c){
			System.out.println("B is Max");
		} else{ 
			System.out.println("C is Max");
		}
		
		// using ternary operator
		int max = a > b ? a > c ? a : c : b > c ? b : c;
		
		System.out.println("Maximum is " +max);
	}
}