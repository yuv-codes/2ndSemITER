import java.util.Scanner;

public class DSA_Q04_NumberOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "CARBON";
        int l = str.length();
        for (int i=0; i<l; i++){
            for (int j=0; j<l; j++){
                for (int k=0; k<1; k++){
                                if (i!=j && j!=k && i!=k){
                                    System.out.println(""+ str.charAt(i)+ str.charAt(j)+ str.charAt(k));
                                }
                }
            }
        }
    }
}
