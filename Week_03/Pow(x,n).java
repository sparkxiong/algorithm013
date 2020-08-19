package Week_03;

public class Pown {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return helper(x, N);
    }
    private double helper(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = helper(x, N / 2);
        if (N % 2 == 0) {
            return y*y;
        } else {
            return y*y * x;
        }
    }
}
