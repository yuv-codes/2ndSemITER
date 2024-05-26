import java.util.Scanner;

public class DSA_Q06_OddNumber {
    public static boolean isOdd(int n){
        return((n&1)==1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n + " is odd - " + isOdd(n));
    }
}
