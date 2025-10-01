package examples;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter an integer >= 0: ");
        Scanner s = new Scanner(System.in);
        System.out.println(factorial(s.nextInt()));
    }
}
