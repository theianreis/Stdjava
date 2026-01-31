//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4;
        nota1 = 10.00f;
        nota2 = 9.00f;
        nota3 = 7.00f;
        nota4 = 5.00f;

        float media = (nota1+nota2+nota3+nota4)/4.00f;

        System.out.printf("O Resultado da média é dado por: %.2f \n",media);

        if (media>=7.00f){
            System.out.println("Aprovado \n");
        }
        else{
            System.out.println("Reprovado \n");
        }
    }
}