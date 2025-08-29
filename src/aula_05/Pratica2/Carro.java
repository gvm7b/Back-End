package aula_05.Pratica2;

public class Carro {
    protected String modelo;
    protected Motor motor = new Motor(200, "Combustão");



    public Carro(String modelo){
        this.modelo = modelo;
    }

    public void dirigir() {
        this.motor.ligar();
        System.out.println("Carro em movimento...");
    }

    public void ligarCarro(){
        this.motor.ligar();
        System.out.println("O carro " + modelo + " esta ligado");
    }

    public void desligarCarro() {
        this.motor.desligar();
        System.out.println("O carro " + modelo + " esta desligado");
    }
}
