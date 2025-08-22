package aula_04;

public class Operador {
    public static void main(String[] args) {
        int numero = 6;

        String resultado = (numero % 2 == 0) ? "Par" : "Impar";

        System.out.println("O numero " + numero + " é " + resultado);
    }
}
