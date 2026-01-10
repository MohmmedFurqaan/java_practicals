public class sum_avg{
    public static void main(String[] args){
        int arr[] = {1, 56, 23, 87, 67, 23};
        int sum = 0;
        int avg;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum of an array is : "+sum);

        avg = sum / arr.length;
        System.out.println("Average of an array is : "+avg);
        
     }
}