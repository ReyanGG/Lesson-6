import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {

        char operator;
        int n1, n2, result;

        Scanner sc = new Scanner(System.in);

        System.out.println("pick operator");
        operator = input.next().charAt(0);
        System.out.println("Enter first number");
        n1 = input.nextInt();

        System.out.println("Enter second number");
        n2 = input.nextInt();

        switch (operator) {

            case '+':
                result = n1 + n2;
                System.out.println( result);
                break;

            case '-':
                result = n1 - n2;
                System.out.println( result);
                break;

            case '*':
                result = n1 * n2;
                System.out.println(result);
                break;

            case '/':
                result = n1 / n2;
                System.out.println(result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        sc.close();
    }
}
