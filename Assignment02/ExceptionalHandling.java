import java.util.Scanner;

public class ExceptionalHandling {
    public static void Lucky(int n) throws NumberFormatException{
        if (n<0){
            throw new NumberFormatException("Negative Number");
        }
        else{
            System.out.println("Your lucky number is: ");
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your lucky number: ");
        int n = sc.nextInt();
        try{
            Lucky(n);
        }
        catch(NumberFormatException e) {
            System.out.println(e);
        }
    }
}