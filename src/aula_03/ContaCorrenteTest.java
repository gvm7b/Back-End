package aula_03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ContaCorrenteTest {
    public static void main(String[] args) {


        ContaCorrente conta1 = new ContaCorrente("Victor", 57777);
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o saldo da conta: ");
        double saldo = input.nextDouble();
        conta1.setSaldo(saldo);

        System.out.println("Digite o limite da conta");
        double limite = input.nextDouble();
        conta1.setLimite(limite);


        conta1.mostrarInfo();
    }
}
