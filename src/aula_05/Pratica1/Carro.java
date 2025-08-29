package aula_05;

class Carro extends Veiculo{
    int portas;

    public Carro(String modelo, int ano) {
        super(modelo, ano);
        this.portas = 2;
    }

    public void abrirPortas() {
        System.out.println("Abrindo " + portas + " portas do carro " + modelo);
    }
}
