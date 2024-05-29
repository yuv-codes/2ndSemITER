import java.util.Scanner;

public class DSA_Q08_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int r = sc.nextInt();
        int n = sc.nextInt();
        int [] [] arr= new int[r][n];
        System.out.println("Enter the elements of 2d array: ");
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The elements of 2D array are: ");
        for (int i=0; i<r; i++){
            for (int j = 0; j<n; j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
        int sum = 0;
        for (int i=0; i<r; i++){
            for (int j=0; j<n; j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("The elements of the 2d array is: "+ sum);
    }
}
