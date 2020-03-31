package ADS.Recursion;

import java.math.BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Recursion {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int x = scanner.nextInt();
//        System.out.println("Enter how much");
//        int n = scanner.nextInt();
//
//        System.out.println(factorial(x));
//        System.out.println(fibonacci(x));
//
//        xMethod(x);
//        System.out.println(yMethod(x));
//
//        System.out.println(n2(x));
//        System.out.println(nx(x, n));
//
//        System.out.println(compute(x));
//
//        zMethod(x);
//        System.out.println("");
//        lMethod(x);
//
//        System.out.println(fact(x));

//        System.out.println("This is iterative "+fibonacciIterative(x));
//        System.out.println(" ");
//        System.out.println("This is recursive "+fibonacci(x));

//        System.out.println("Enter a second number");
//        int y = scanner.nextInt();

//        System.out.println(gcd(x,y));

        System.out.println(mi183(x));


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
    // the next number is the sum of the last two numbers,
    // the first number is 1 and the second number is 1.
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

    // ex 18.7

    public static void zMethod(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            zMethod(n - 1);
        }
    }

    // ex 18.7-2
    public static void lMethod(int n) {
        if (n > 0) {
            lMethod(n - 1);
            System.out.print(n + " ");
        }
    }

    // last ex 181
    public static BigInteger fact (int n) {
        BigInteger x = BigInteger.valueOf(n);
        if (n <= 1) {
            return x;
        }

        return x.multiply(fact(x.subtract(BigInteger.valueOf(1)).intValue()));
    }

    // fibonacci iterative
    // last ex 18.2
    public static int fibonacciIterative(int n) {
        if(n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for(int i=2; i<n; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }
        return fib;
    }

    // last ex 18.3
    public static int gcd (int x, int y) {
        if (x%y == 0) {
             return y;

        }
        return gcd (y, x%y);
    }

    // last ex 18.4
    public static float mi183(float i) {
        if (i == 1) { return 1;}
        return 1/ i + mi183(i-1);
    }

}

