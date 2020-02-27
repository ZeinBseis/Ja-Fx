package ADS.Recursion;

import java.util.Scanner;

public class Recursion {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int x = scanner.nextInt();
        //System.out.println("Enter how much");
        //int n = scanner.nextInt();

        //System.out.println(factorial(x));
        System.out.println(fibonacci(x));

        //xMethod(x);
        //System.out.println(yMethod(x));

        //System.out.println(n2(x));
        //System.out.println(nx(x, n));

        //System.out.println(compute(x));

    }

    // 18.1
    static int factorial (int n) {
        int result = 1;
        if (n <= 1) {
            return result;

        } else {
            return n * factorial(n - 1);
        }
    }

    // 18.3
    static int fibonacci (int n) {
        if (n < 2 ) {
            return n;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }


    }

    // ex 18.3
    static void xMethod(int n) {
        if (n > 0) {
            System.out.print(n % 10);
            xMethod(n / 10);
        }
    }

    public static int yMethod(int n) {
        if (n == 1)
            return 1;
        else
            return n + yMethod(n - 1);
    }

    // ex 18.4
    static int n2 (int n) {
        if (n <= 0) {
            return 1;
        } else {
            return 2 * n2(n-1);
        }
    }

    // ex 18.5
    static int nx (int x, int n) {
        if (n <= 0) {
            return 1;
        } else {
            return x * nx(x, n-1);
        }
    }

    // ex 18.6
    static int compute (int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n + compute(n-1);
        }
    }

}

