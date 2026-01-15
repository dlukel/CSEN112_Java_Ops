public class AdditionCalculator {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please enter more arguments!");
            System.out.println("Usage: java AdditionCalculator <num1> <num2> | where num1 and num2 are integers!");
            return;
        }
        try {
            int firstNum = Integer.parseInt(args[0]);
            int secondNum = Integer.parseInt(args[1]);
            int sum = firstNum + secondNum;
            System.out.println("The sum of " + firstNum + " and " + secondNum + " is equal to " + sum);
        } catch (NumberFormatException e) {
            System.out.println("The arguments must be integer numbers!");
            System.out.println("Usage: java AdditionCalculator <num1> <num2> | where num1 and num2 are integers!");
        }
    }
}
