package aula_05.Pratica3;

class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;

    }

    public double calcularBonus(){
        System.out.println("O salarion nome é: " + salario * 1.05);


        return salario;
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Roberto", 1500);

        Gerente gerente = new Gerente("Guilherme", 9000);

        Vendedor vendedor = new Vendedor("Victor", 5000);

        funcionario.calcularBonus();
        gerente.calcularBonus();
        vendedor.calcularBonus();
    }

}
