import java.util.Scanner;

public class Calculator {
    private static double result;

    public Calculator() {
        this.result = 0;
    }

    public static void main(String[] args) {
        char operation;
        int num;

        while (true) {
            Scanner operationScanner = new Scanner(System.in);
            System.out.println(result);
            System.out.println("add, subtract, multiply, or divide?");
            operation = operationScanner.nextLine().charAt(0);
            System.out.println("How much?");
            num = operationScanner.nextInt();
            switch (operation) {
                case 'a':
                    result += num;
                    break;
                case 's':
                    result -= num;
                    break;
                case 'm':
                    result *= num;
                    break;
                case 'd':
                    result /= num;
                    break;
                default:
                    continue;
            }
        }
    }
}
