package aula_04;

public class ExemploSwitch {
    public static void main(String[] args) {

        float num1 = 2, num2 = 3;
        byte opcao= 1;

        switch (opcao) {
            case 1:
                System.out.println("Resultado adição: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado subtração: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado multiplicação: " +(num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado da divisão: " + (num1 / num2));

                } else {
                    System.out.println("Erro");
                }
                break;
            default:
                System.out.println("Opção invalida!");
        }

        for(int i = 0; i < 5; i++) {
            System.out.println("Indice: " + i);
        }
    }
}
