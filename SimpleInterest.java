import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to simple interst Calculator\n");
        System.out.print("Please enter your principle amount Rs:");
        int principle = input.nextInt();
        System.out.print("Please enter your rate of interest: ");
        float rate = input.nextFloat();
        System.out.print("Please enter your years of your borrowing: ");
        float years= input.nextFloat();

        float interest= (principle * rate * years) / 100;
        System.out.println("Your rate of Interest is:" + interest);

    }
}
