import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      System.out.println("Welcome to swap world\n\n");
        System.out.print("Enter value of a: ");
      int a = input.nextInt();
        System.out.print("Enter value of b: ");
      int b = input.nextInt();

      int c = a;
       a = b;
       b = c;
      System.out.println("Swapping is done....");
      System.out.println("Value of a is : " +a);
      System.out.println("value of B is : " +b);


    }
}
