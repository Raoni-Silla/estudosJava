package academy.devdojo.exerciciosFixacao;

import java.util.Scanner;

/**
 * int numeroSecreto = (int) (Math.random() * 100) + 1;
 *
 * Explicando Math.random()
 * Começamos com Math.random().
 *
 * Math: É uma classe padrão do Java que fornece métodos para realizar operações matemáticas comuns. Pense nela como uma "caixa de ferramentas" para matemática.
 *
 * .random(): É um método dentro da classe Math. O que ele faz? Ele gera um número decimal aleatório entre 0.0 (inclusive) e 1.0 (exclusive).
 *
 * Ou seja, o número gerado pode ser 0.0, 0.123, 0.5, 0.999... mas nunca 1.0.
 *
 * Explicando * 100
 * Se Math.random() te dá um número entre 0.0 e 1.0 (não incluindo 1.0), o que acontece quando multiplicamos por 100?
 *
 * Math.random() * 100
 *
 * Se Math.random() fosse 0.0, o resultado seria 0.0 * 100 = 0.0.
 *
 * Se Math.random() fosse 0.5, o resultado seria 0.5 * 100 = 50.0.
 *
 * Se Math.random() fosse 0.999, o resultado seria 0.999 * 100 = 99.9.
 *
 * Ou seja, ao multiplicar por 100, agora temos um número decimal aleatório entre 0.0 (inclusive) e 100.0 (exclusive).
 *
 * Explicando (int) (Casting)
 * Agora vem uma parte importante: (int). Isso é chamado de casting.
 *
 * casting: Significa que estamos "forçando" um tipo de dado a se transformar em outro.
 *
 *  (int) (algum_numero_decimal): Pega um número decimal e descarta a parte decimal, mantendo apenas a parte inteira. Ele trunca, não arredonda.
 *
 * Se o resultado de Math.random() * 100 fosse 0.0, (int) 0.0 se tornaria 0.
 *
 * Se o resultado fosse 50.7, (int) 50.7 se tornaria 50.
 *
 * Se o resultado fosse 99.9, (int) 99.9 se tornaria 99.
 *
 * Então, depois do (int), nosso número aleatório agora é um inteiro entre 0 (inclusive) e 99 (inclusive).
 *
 * Explicando + 1
 * Por fim, adicionamos + 1.
 *
 * ... + 1: Isso serve para ajustar o intervalo.
 *
 * Se o menor número possível era 0, agora é 0 + 1 = 1.
 *
 * Se o maior número possível era 99, agora é 99 + 1 = 100.
 *
 * Com isso, garantimos que o numeroSecreto será um inteiro aleatório entre 1 (inclusive) e 100 (inclusive), que é o que queremos para o jogo de adivinhação.
 *
 * Resumindo a Linha Completa
 * int numeroSecreto = (int) (Math.random() * 100) + 1;
 *
 * Math.random(): Gera um decimal de 0.0 a 0.999...
 *
 * * 100: Transforma para um decimal de 0.0 a 99.999...
 *
 * (int): Converte para um inteiro, truncando, de 0 a 99.
 *
 * + 1: Ajusta para um inteiro de 1 a 100.
 */
public class ExercicioJogoDeAdivinhacaoSimples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Adivinhe o numero entre 1 e 100: ");
        int n = input.nextInt();
        int numSec = (int) (Math.random() * 100) + 1;

        do {
            if (n > numSec){
                System.out.println("=============================");
                System.out.println("Tente um numero menor");
                System.out.println("=============================");
                System.out.println("Digite outro numero menor: ");
                System.out.println("==============================");
                n = input.nextInt();
            }else{
                System.out.println("=============================");
                System.out.println("Tente um numero maior");
                System.out.println("============================");
                System.out.println("Digite um numero maior: ");
                System.out.println("============================");
                n = input.nextInt();
            }
        }while (numSec != n);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Parabéns, você adivinhou o numero "+ numSec + " secreto!!!!");
        System.out.println("--------------------------------------------------------------");
        input.close();
    }

}
