import java.util.Scanner;

public class DSA_Q09_SumOfDiagonalElem {
    public static double sumMajorDiagonal(double[][] m) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (m[i] == m[j]){
                    sum+=m[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row-by-column:");
        double[][] m = new double[4][4];
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m.length; j++){
                m[i][j] = sc.nextDouble();
            }
        }
        for(int i = 0 ; i<4 ; i++){
            for(int j = 0 ; j<4 ; j++){
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m) );
    }
}