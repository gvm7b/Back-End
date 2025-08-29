package aula_05.Pratica2;

public class CarroTest {
    public static void main(String[] args) {
        Motor motor = new Motor(200, "Combustao");
        Carro carro = new Carro("Corsa");

        carro.ligarCarro();
        carro.desligarCarro();
    }
}
