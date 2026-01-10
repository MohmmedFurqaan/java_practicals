public class sum_matrices {
    public static void main(String[] args) {

        // inputed array
        int arr1[][] = {{1, 2, 3}, {4, 5, 6}};
        int arr2[][] = {{8, 7, 6}, {5, 4, 3}};


        // dimension of the array
        int rows = arr1.length;
        int cols = arr1[0].length;

        // declaring the size of the sum array
        int sum[][] = new int[rows][cols];

        // sum of the matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // printing the sum
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(sum[i][j] + " ");
            }
            System.out.println();
        }


    }
}
