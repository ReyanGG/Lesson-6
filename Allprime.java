import java.util.Scanner;

public class Allprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        int b = 0;
        for (int i = 0; i <= a; i++) {
            for (int k = 2; k * k <= i; i++) {
                if (i % k == 0) {

                    break;
                }

            }
            if (b == 0) {
                System.out.println(i);

            }

        }
        sc.close();
    }
}