public class fatorialIterativo {
    static long fat(int n) {
        long resultado = 1;

        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(fat(4)); // 2.432902008e18
    }
}
