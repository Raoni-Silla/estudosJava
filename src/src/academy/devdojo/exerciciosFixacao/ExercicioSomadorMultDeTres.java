package academy.devdojo.exerciciosFixacao;

public class ExercicioSomadorMultDeTres {
    public static void main(String[] args) {
        int numAtual = 1;
        int soma = 0;
        do{
            if (numAtual % 3 == 0){soma+=numAtual;}
            numAtual++;
        }while(numAtual<=50);
        System.out.println("A soma total dos numeros multiplos de 3 até 50 é: "+ soma);
    }
}
