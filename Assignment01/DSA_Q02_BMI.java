import java.util.Scanner;

public class DSA_Q02_BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        double weight = sc.nextDouble();
        System.out.println("Enter your height (in m): ");
        double height = sc.nextDouble();
        double BMI = weight / (height*height);
        System.out.println("Your BMI is: "+ BMI);
        if(BMI < 18.5){
            System.out.println("Underweight");
        }
        if(BMI >= 18.5 && BMI <= 24.9 ){
            System.out.println("Normal weight");
        }
        if(BMI >= 25 && BMI <= 29.9){
            System.out.println("Overweight");
        }
        if(BMI > 30.0){
            System.out.println("Obese");
        }
    }
}
