package NumberTheory;

public class Factorial {

    // Recursive approach
    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;  // base case
        }
        return n * factorialRecursive(n - 1);  // recursive step
    }

    public static void main(String[] args) {
        int number = 5; // example input
        System.out.println("Factorial of " + number + " is " + factorialRecursive(number));
    }
}


