package aula_05;

class Moto extends Veiculo{
    boolean temBagageiro;

    public Moto (String modelo, int ano) {
        super(modelo, ano);
    }

    public void empinar() {
        System.out.println("A moto " + modelo + " está empinando!");
    }
}
