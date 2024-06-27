import java.util.Scanner;

public class ExceptionalHandling2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[4];
        System.out.println("Enter four colors: ");
        for (int i=0; i<4; i++){
            arr[i] = sc.nextLine();
        }
        try{
            int a = Integer.parseInt(arr[0]);
        }
        catch(NumberFormatException e){
            System.out.println("Convert String to Integer");
            System.out.println(e);
            System.out.println("Enter one more color: ");
            arr[0] = sc.nextLine();
        }
        try{
            arr[5] = "VIOLET";
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        for (int i=0; i<4; i++){
            System.out.println(arr[i]);
        }
    }
}
