public class Armstrong {
    public static void main(String[]args){
        int number = 10, original,reminder,result=0;
        original = number;
        while (original !=0)
        {
            reminder=original % 10;
            result += Math.pow(reminder, 3);
            original /=10;

        }
        if (result == number)
            System.out.println(number + "-->is an armstrong number.");
        else
            System.out.println(number + "-->Is not an armstrong number");
    }}
