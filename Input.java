import java.util.*;
public class Input{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input your age: ");

        int age = sc.nextInt();
        System.out.println(age);

        Scanner ab = new Scanner(System.in);
        System.out.println("Enter your name:");
        String cd = ab.nextLine();
        System.out.println(cd);
    }
}
