package academy.devdojo.exerciciosFixacao;
import java.util.Scanner;
public class ExercicioVoto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        input.close();
        if (idade < 16){

            System.out.println("não pode votar");

        }else if (idade >= 16 && idade < 18){

            System.out.println("pode votar [voto facultativo]");

        }else if (idade >= 18 && idade < 70) {

            System.out.println("VOTO OBRIGATORIO!!");
        }else {
            System.out.println("voto facultativo");
        }
    }
}
