public class SquareRootBinarySearch {

    // Function to return square root of x
    public static int squareRoot(int x) {
        if (x == 0 || x == 1) return x; // Base cases

        int start = 1, end = x, ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If x is a perfect square
            if (mid * mid == x) {
                return mid;
            }

            // If mid*mid < x, move right
            if (mid * mid < x) {
                start = mid + 1;
                ans = mid; // store the floor value
            }
            // Else move left
            else {
                end = mid - 1;
            }
        }
        return ans; // floor of sqrt(x)
    }

    public static void main(String[] args) {
        int x = 37;
        System.out.println("Square root of " + x + " is " + squareRoot(x));
    }
}
