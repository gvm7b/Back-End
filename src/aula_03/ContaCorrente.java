package aula_03;

public class ContaCorrente {
    private String titular;

    private int numeroDaConta;

    private double saldo;

    private double limite;

    public ContaCorrente(String titular, int numeroDaConta) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0;
        this.limite = 1000;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void Depositar(){

    }

    public void mostrarInfo(){
        System.out.println("Titular: " + getTitular() +
                ", Numero da Conta: " + getNumeroDaConta() +
                ", Saldo: " + getSaldo() +
                ", Limite Disponivel: " + getLimite());
    }
}
