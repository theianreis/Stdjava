public class fibonacci {
    static long fib(int n) {
        if (n <= 1) return n;

        long a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(fib(50)); // 12586269025
    }
}
