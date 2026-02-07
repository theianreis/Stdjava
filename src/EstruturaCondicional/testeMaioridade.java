package EstruturaCondicional;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class testeMaioridade {
    // Criação de um método
    static void checkAge(int age){
        if (age<18){
            System.out.println("Maior de Idade");
        }
        else {
            System.out.println("Menor idade");
        }
    }

    //
    public static void main(String[] args){
        int idade = 12;
        checkAge(12);
    }
}

