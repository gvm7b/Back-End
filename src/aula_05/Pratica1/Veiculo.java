package aula_05;

public class Veiculo {
    protected String modelo;
    protected int ano;

    public Veiculo (String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("O veiculo " + modelo + " está ligado.");
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Corolla", 2020);
        Moto moto = new Moto("BMW S1000 hp4", 2014);

        carro.ligar();
        carro.abrirPortas();

        moto.empinar();


    }
}
