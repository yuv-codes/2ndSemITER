import java.util.Arrays;

public class OccurrenceOfAnElement {
    public <T> int count(T[] arr, T item){
        int c = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i] == item)
            c++;
        }
        return c;
    }

    public static void main(String[] args) {
        OccurrenceOfAnElement obj = new OccurrenceOfAnElement();
        Integer [] a = { 10,20,30,40,50,10,20,70,10};
        System.out.println("Occurrence of element: " + obj.count(a,10));

        String [] b= {"IGT", "DSA", "UPEM" , "CALCULUS" , "IGT" , "IGT"};
        System.out.println("Occurrence of element: " + obj.count(b,"IGT"));

    }
}
