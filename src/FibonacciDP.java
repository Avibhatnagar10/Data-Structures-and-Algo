import java.math.BigInteger;

public class FibonacciDP {
    // Method to compute Fibonacci series using Dynamic Programming with BigInteger
    public static BigInteger fibonacci(int n) {
        // Create an array to store Fibonacci numbers as BigIntegers
        BigInteger[] fib = new BigInteger[n + 1];

        // Base cases
        if (n == 0) {
            return BigInteger.ZERO;
        }
        if (n == 1) {
            return BigInteger.ONE;
        }

        // Initialize the base cases
        fib[0] = BigInteger.ZERO;
        fib[1] = BigInteger.ONE;
        // Compute the Fibonacci numbers and store them in the array
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1].add(fib[i - 2]);
        }

        // Return the nth Fibonacci number
        return fib[n];
    }

    public static void main(String[] args) {
        int n = 100; // Compute the Fibonacci number at position 100
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}
