import java.util.Scanner;

public class DSA_Q01_RepetitiveDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        int num = n;
        while(n>2){
            n/=2;
            count+=1;
        }
        System.out.println("The number of times one must repeatedly divide " + num + " before getting a value less than 2 is " + count);
    }
}

