public class fatorial {
    static long fat(int n) {
        if (n <= 1) return 1;
        return n * fat(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fat(5)); // 120
    }
}
