import java.util.Scanner;
public class DSA_Q03_SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        int prod = 1;
        int r;
        while(num!=0){
            r = num%10;
            sum += r;
            prod *= r;
            num /= 10;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + prod);
        if (sum == prod){
            System.out.println(n + " is a spy number");
        }
    }
}
