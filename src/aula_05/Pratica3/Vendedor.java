package aula_05.Pratica3;


class Vendedor extends Funcionario{
    public Vendedor(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double calcularBonus(){
        System.out.println("O salarion nome é: " + salario * 1.10);


        return salario;
    }


}
