public class SingleGenericMethod {
    public static <T> void array(T []array){
        for (int i=0; i< array.length; i++){
            System.out.println(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer [] a = {10,20,30,40,50};
        System.out.println("Integer Array elements are: ");
        array(a);

        String[] b = {"IGT", "DSA" , "UPEM", "CALCULUS"};
        System.out.println("String array elements are: ");
        array(b);
    }

}
