package aula_05;

class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    public void mostrarNome() {
        System.out.println("O nome do gato é: " +nome);
    }
}
