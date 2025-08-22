package aula_04;

public class Vetor {
    private int capacidade;
    private int ultima_posicao;
    private int[] valores;

    public Vetor(int capacidade) {
        this.capacidade = capacidade;
        this.ultima_posicao = -1;
        this.valores = new int[capacidade];
    }

    public void imprimir() {
        if(ultima_posicao == -1) {
            System.out.println("O vetor esta vazio");

        }else {
            for(int i = 0; i < ultima_posicao; i++) {
                System.out.println(i + " - " + valores[i]);
            }
        }
    }

    public void inserir(int valor){
        if(ultima_posicao == capacidade -1) {
            System.out.println("Capacidade máxima atingida");
            return;
        }

        int posicao = 0;
        for (int i = 0; i <= ultima_posicao; i++){
            posicao = i;
            if(valores[i] > valor) {
                break;
            }
            if (i == ultima_posicao) {
                posicao = i + 1;
            }
        }

        int x = ultima_posicao;
        while(x >= posicao) {
            valores[x + 1] = valores[x];
            x--;
        }

        valores[posicao] = valor;
        ultima_posicao++;
    }

    public int pesquisaLinear(int valor) {
        for(int i = 0; i < ultima_posicao; i++) {
            if(valores[i] > valor) {
                return -1;
            }
            if (valores[i] == valor) {
                return i;
            }
            if(ultima_posicao == i) {
                return -1;
            }


        }
        return 0;
    }

    public int pesquisaBinaria(int valor) {
        int limiteInferior = 0;
        int limiteSuperior = ultima_posicao;

        while(true) {
           int posicaoAtual = (limiteInferior + limiteSuperior) /2;
           // se achou na primeira tentativa

            if(valores[posicaoAtual] == valor) {
                return posicaoAtual;
            } else if (limiteInferior > limiteSuperior) {
                return -1;
                
            }else {
                if(valores[posicaoAtual] < valor) {
                    limiteInferior = posicaoAtual + 1;
                }else {
                    limiteSuperior = posicaoAtual - 1;
                }
            }
        }

    }
    public void excluir(int valor) {
        int posicao = pesquisaLinear(valor);
        if(posicao == -1) {
        } else {
            for(int i = posicao; i < ultima_posicao; i++) {
                valores[i] = valores[i + 1];
            }
            ultima_posicao++;
        }
    }

    public static void main(String[] args) {
        Vetor vetorOrdenado = new Vetor(7);

        vetorOrdenado.inserir(Integer.parseInt("g"));
        vetorOrdenado.inserir(Integer.parseInt("u"));
        vetorOrdenado.inserir(Integer.parseInt("i"));
        vetorOrdenado.inserir(Integer.parseInt("l"));
        vetorOrdenado.inserir(Integer.parseInt("h"));
        vetorOrdenado.inserir(Integer.parseInt("e"));

        vetorOrdenado.imprimir();
    }



}
