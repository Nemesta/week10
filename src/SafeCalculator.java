import java.util.Scanner;
public class SafeCalculator {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int[] in = new int[2];
            try {
                System.out.print("Enter first number (or 'exit'): ");
                String input1 = sc.nextLine();
                if (input1.equalsIgnoreCase("exit")) {
                    System.out.println("Goodbye!");
                    break;
                }
                in[0] = Integer.parseInt(input1);
                System.out.print("Enter second number: ");
                String input2 = sc.nextLine();
                in[1] = Integer.parseInt(input2);
                int result = in[0] / in[1];
                System.out.println("Result: " + in[0] + " / " + in[1] + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero. Try again.");
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter valid integers only.");
            }
        }
    }
}