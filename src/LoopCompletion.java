import java.util.Scanner;

public class LoopCompletion {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int num, total = 0;

        for(int count = 0; count < 10; count++){
            System.out.print("Enter a number. Once 10 numbers have been entered the total will be calculated. Your current count is: " + (count + 1) + "\n");
            num = keyboard.nextInt();
            total += num;
        }

        System.out.println("The total of all 10 numbers is " + total);
    }
}
