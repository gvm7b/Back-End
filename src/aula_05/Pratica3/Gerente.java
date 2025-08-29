package aula_05.Pratica3;

class Gerente extends Funcionario{
    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double calcularBonus(){
        System.out.println("O salarion nome é: " + salario * 1.15);


        return salario;
    }

}
