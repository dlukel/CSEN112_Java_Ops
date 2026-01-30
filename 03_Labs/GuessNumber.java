import java.util.Scanner;

public class GuessNumber{
    public static String readLine(String prompt){
        Scanner cin = new Scanner(System.in);
        System.out.print(prompt + ' ');
        return cin.nextLine();
    }
    public static void main(String[] args){
        int guessed = Integer.parseInt(readLine("Guess the number between 1 and 100:"));
        int secret = (int)(100 * Math.random() + 1);
        int attempts = 1;
        while (guessed!=secret){
            if (guessed > secret)
                System.out.println("Too high! Try again.");
            else if (guessed < secret)
                System.out.println("Too low! Try again.");
            guessed = Integer.parseInt(readLine("Guess the number between 1 and 100:"));
            ++attempts;
        }
        System.out.println("Congratulations! You guessed the number after " + attempts + " attempts.");
    }
}