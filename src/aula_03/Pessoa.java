package aula_03;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa() {
        this.idade = 0;
        this.nome = "Desconhecido";
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.idade = 0;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibir(){
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
