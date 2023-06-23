import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Enter Your Name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Your name is :" + name);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        System.out.println("Your age is : "+ age);
//        System.out.println(age);


    }
}
