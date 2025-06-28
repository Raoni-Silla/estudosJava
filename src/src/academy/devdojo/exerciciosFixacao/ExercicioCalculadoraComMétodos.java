package academy.devdojo.exerciciosFixacao;
import java.util.Scanner;
public class ExercicioCalculadoraComMétodos {
    public static double somar (double num1, double num2){
        double soma = num1 + num2;
        return soma;
    }
    public static double subtrair (double n1, double n2){
        double sub = n1 - n2;
        return sub;
    }
    public static double multiplicar (double n1, double n2){
        double mult = n1 * n2;
        return mult;
    }
    public static double dividir (double n1, double n2){
        double div = n1/n2;
        double resto = n1 % n2;
        System.out.println("o resto é " + resto);
        return div;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double n = input.nextDouble();
        System.out.println("Digite outro numero: ");
        double n1 = input.nextDouble();
        System.out.println("fazendo os calculos.......");
        System.out.println("=====================================");
        System.out.println("a soma deles é "+ somar(n,n1));
        System.out.println("-------------------------------------");
        System.out.println("a subtração é "+ subtrair(n,n1));
        System.out.println("-------------------------------------");
        System.out.println("a multiplicação é "+ multiplicar(n,n1));
        System.out.println("--------------------------------------");
        System.out.println("a divisão é "+ dividir(n,n1));
        System.out.println("--------------------------------------");

        input.close();
    }
}
