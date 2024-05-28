import java.util.Scanner;

public class DSA_Q07_MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements of an array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max =arr[0];
        int max_ctr = 0;
        int max_index_first=0;
        int max_index_last=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
                max_index_last=i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max){
                max_ctr+=1;
                max_index_last=i;

            }
        }
        int min = arr[0] ;
        int min_ctr = 0 ;
        int min_index_first = 0 ;
        int min_index_last = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
                min_index_first=i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==min){
                min_ctr+=1;
                min_index_last=i;
            }
        }
        System.out.println("Maximum element of Array is " + max + " and occurs " +  max_ctr + " times. " );
        System.out.println("Minimum element of Array is " + min + " and occurs "+ min_ctr + " times. ");
        System.out.println("First occurrence of maximum element is at "+(max_index_first+1));
        System.out.println("Last occurrence of minimum element is at "+ (min_index_last+1));
        System.out.println("First occurrence of minimum element is at "+(min_index_first+1)); // Extra statement
        System.out.println("Last occurrence of minimum element is at "+ (max_index_last+1));  // Extra statement

    }
}
