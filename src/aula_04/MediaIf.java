package aula_04;

public class MediaIf {
    public float media = 8;
    public int numerofalta = 5;

    public void calculomedia() {
        if (media >= 6 && numerofalta <= 20) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }


        if (media < 6 || numerofalta > 20) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
    }


}



