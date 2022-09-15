import java.util.Scanner;
public class Program1 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = userInput.nextInt();
        if (num > 0)
        {
            System.out.println("Positive");
        } else if (num == 0)
        {
            System.out.println("Zero");
        } else if (num < 0)
        {
            System.out.println("Negative");
        }
    }
}
