public class sum_digit{
	public static void main(String[] args){
		int num = 147;
		int l_digit = 0;
		int sum = 0;
		
		while (num > 0){
			
			l_digit = num % 10;
			sum += l_digit;
			num = num / 10;
			
		}
		
		System.out.println("Sum is "+sum);
	}
}