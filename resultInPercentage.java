import java.util.Scanner;

public class resultInPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Math Marks");
        int Math = sc.nextInt();
        System.out.println("Enter Your Physics Marks");
        int Physics = sc.nextInt();
        System.out.println("Enter Your Bio Marks");
        int Bio = sc.nextInt();
        int sum = (Math) + (Physics) + (Bio) ;

        int total = 300;
        int percentage = (sum*100)/total;

        System.out.println(" Your Percentage is :" + percentage +"%");
    }
}
