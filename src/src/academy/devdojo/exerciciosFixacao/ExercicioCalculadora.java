package academy.devdojo.exerciciosFixacao;
import java.util.Scanner;
public class ExercicioCalculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1;
        double n2;
        double resultado;
        System.out.println("Digite um numero: ");
        n1 = input.nextDouble();
        System.out.println("Digite outro numero: ");
        n2 = input.nextDouble();

        resultado = n1+ n2;
        System.out.println("soma:"+ resultado);
        System.out.println( "subtração: " + (n1 - n2));
        System.out.println("Multiplicação: "+ n1*n2);
        System.out.println("Divisão: "+ n1/n2);
        int dividendo;
        int divisor;
        System.out.println("digite o valor do dividendo: ");
        dividendo=input.nextInt();
        System.out.println("digite o valor do divisor: ");
        divisor = input.nextInt();
        input.close();
        System.out.println("resto: "+ dividendo % divisor);

    }
}
