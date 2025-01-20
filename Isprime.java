import java.util.Scanner;

public class Isprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        int b = 0;

        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                b = b + 1;
                break;
            }
        }
        if (b == 0) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

}