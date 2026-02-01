package convertBin;

public class RealParaBinario {

    public static String decimalParaBinario(double num, int precisao) {
        StringBuilder bin = new StringBuilder();

        // Parte inteira
        int parteInteira = (int) num;
        double parteFracionaria = num - parteInteira;

        bin.append(Integer.toBinaryString(parteInteira));
        bin.append(".");

        // Parte fracionária
        while (precisao-- > 0) {
            parteFracionaria *= 2;
            int bit = (int) parteFracionaria;

            bin.append(bit);
            parteFracionaria -= bit;

            if (parteFracionaria == 0)
                break;
        }

        return bin.toString();
    }

    public static void main(String[] args) {
        System.out.println(decimalParaBinario(13.625, 10)); // 1101.101
        System.out.println(decimalParaBinario(2.25, 10));   // 10.01
        System.out.println(decimalParaBinario(0.1, 20));    // aproximação
    }
}
