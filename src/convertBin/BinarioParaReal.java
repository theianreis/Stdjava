package convertBin;

public class BinarioParaReal {

    public static double binarioParaDecimal(String bin) {
        // Separa parte inteira e fracionária
        String[] partes = bin.split("\\.");
        String inteira = partes[0];
        String fracionaria = partes.length > 1 ? partes[1] : "";

        double resultado = 0;

        // ---- Parte inteira ----
        int potencia = inteira.length() - 1;
        for (char bit : inteira.toCharArray()) {
            if (bit == '1') {
                resultado += Math.pow(2, potencia);
            }
            potencia--;
        }

        // ---- Parte fracionária ----
        double divisor = 2.0;
        for (char bit : fracionaria.toCharArray()) {
            if (bit == '1') {
                resultado += 1.0 / divisor;
            }
            divisor *= 2;
        }

        return resultado;
    }

    // Teste
    public static void main(String[] args) {
        System.out.println(binarioParaDecimal("101.101"));   // 5.625
        System.out.println(binarioParaDecimal("10.01"));    // 2.25
        System.out.println(binarioParaDecimal("111.111"));  // 7.875
    }
}
