import javax.management.remote.SubjectDelegationPermission;
import java.util.Scanner;

class Student {
    String name;
    int marks;

    void getData(String n, int m) {
        name = n;
        marks = m;
    }
}
class MarksOutOfBoundException extends Exception{
    MarksOutOfBoundException(String s){
        super(s);
    }

public class ExceptionalHandling3 {
    public static void check_marks(String n, int m) throws MarksOutOfBoundException{
        if(m>100){
            throw new MarksOutOfBoundException("Marks can't be greater than 100");
        }
        else{
            System.out.println(n+ " has got " + m);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String n = sc.nextLine();
        System.out.println("Enter marks: ");
        int m = sc.nextInt();
        Student s1 = new Student();
        s1.getData(n,m);
        try{
            check_marks(n,m);
        }
        catch(MarksOutOfBoundException e){
            System.out.println(e);
        }
        }
    }
}
