package aula_03;

public class Produto {
     String nome;
     double preco;
     int quantidade;

    public Produto() {
        this.nome = "sem nome";
        this.preco = 0;
        this.quantidade = 0;

    }

    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0;
        this.quantidade = 0;
    }




    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", preco: " + preco + ", Quantidade: " + quantidade);
    }
}
