package EstruturadeRepe;

public class ExponencialBinária {

    public static double myPow(double x, int n) {
        // Converte para long para evitar overflow quando n = -2^31
        long N = n;

        // Se o expoente for negativo, inverte a base
        if (N < 0) {
            x = 1.0 / x;
            N = -N;
        }

        return fastPow(x, N);
    }

    // Exponenciação binária
    private static double fastPow(double x, long n) {
        double result = 1.0;

        while (n > 0) {
            // Se o bit atual de n for 1, multiplicamos no resultado
            if ((n & 1) == 1) {
                result *= x;
            }

            // Eleva a base ao quadrado
            x *= x;

            // Avança para o próximo bit
            n >>= 1;
        }

        return result;
    }

    // Testes
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));   // 1024.0
        System.out.println(myPow(2.10000, 3));    // 9.261
        System.out.println(myPow(2.00000, -2));   // 0.25
        System.out.println(myPow(2.0, -2147483648)); // funciona corretamente
    }
}
