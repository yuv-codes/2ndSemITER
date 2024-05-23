import java.util.Scanner;

public class DSA_Q05_SumOfDigits  {
    public static int sum_Of_Digits(int n){
        int sum = 0 , r ;
        while(n>=10){
            sum = 0 ;
            while(n!=0){
                r=n%10;
                sum+=r;
                n/=10;
            }
            n = sum;
        }
        return n ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of the digits of " + n + " until the number is a single digit: " + sum_Of_Digits(n));

    }
}
