// Fibonacci sequence (recursive)

public class FibonacciRecursive {
    
    static int fibonacci(int n) {
        if (n == 0) return 0;   
        if (n == 1) return 1;   
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int terms = 10; 

        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
