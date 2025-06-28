package academy.devdojo.exerciciosFixacao;
import java.util.Scanner;
public class ExercicioTabuadaDinamica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero que voce deseja: ");
        int n1 = input.nextInt();
        System.out.println("==========================================");
        System.out.println("Calculando tabuada do numero desejado.....");
        System.out.println("==========================================");
        for (int i =0; i <= 10 ; i++){
            System.out.println(n1 + "x" + i + "=" + (n1 * i));
        }
        input.close();
        System.out.println("==========================================");
    }
}
