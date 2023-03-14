import java.time.Year;
import java.util.Scanner;
public class Leapyearornot {
    public static void main(String[]args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the Year -->");
        int year =s.nextInt();
        boolean leap;
        leap = false;
        if (year %4==0) {
            boolean Year;
            System.out.println(year + "is a leap year");
        }
        else {
            System.out.println(year+"is not an leap year.");

        }
    }
}
