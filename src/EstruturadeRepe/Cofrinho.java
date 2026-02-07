package EstruturadeRepe;

public class Cofrinho {

    public static void main(String[] args) {

        double saldo = 1000.0;
        double aporte = 200.0;
        double taxa = 0.01;

        int meses = 12;
        double totalInvestido = saldo;

        System.out.println("📈 Evolução do investimento:\n");

        for (int mes = 1; mes <= meses; mes++) {

            saldo += aporte;
            totalInvestido += aporte;

            saldo *= (1 + taxa);

            System.out.printf(
                    "Mês %2d → Saldo: R$ %.2f%n",
                    mes, saldo
            );
        }

        double jurosGanhos = saldo - totalInvestido;

        System.out.println("\n💰 Resumo final:");
        System.out.printf("Total investido: R$ %.2f%n", totalInvestido);
        System.out.printf("Saldo final:     R$ %.2f%n", saldo);
        System.out.printf("Juros ganhos:    R$ %.2f%n", jurosGanhos);
    }
}
