import java.util.Scanner;

public class Electricity
{
    public static void main(String[] args)
    {
        System.out.println("Enter the Bill unit");
        Scanner S = new Scanner(System.in);
        int bijli = S.nextInt();
        if (bijli < 50)
        {
            double bill = (int) (bijli * 0.50);
            System.out.println("Your Bijli ka bill phata hai " + bill);
        } else if (bijli > 50 && bijli < 150)
        {
            double bill = (int) (bijli * 0.75);
            System.out.println("Your bijli ka bill phata hai" + bill);
        } else if (bijli >= 150 && bijli < 250)
        {
            double bill = (int) (bijli * 1.20);
            System.out.println("Your bijli ka bill phata hai" + bill);
        } else if (bijli >= 250)
        {
            double bill = (int) (bijli * 1.50);
            System.out.println("Your bijli ka bill phata hai" + bill);
        }
    }
}