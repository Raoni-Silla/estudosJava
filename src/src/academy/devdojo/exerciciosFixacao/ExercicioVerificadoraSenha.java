package academy.devdojo.exerciciosFixacao;

import java.util.Scanner;

public class ExercicioVerificadoraSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String senhaCorreta = "JavaGemini";
        System.out.println("Digite sua senha: ");
        String senhaDigitada = input.nextLine();
        do {
            System.out.println("senha incorreta, Acesso negado");
            System.out.println("===============================");
            System.out.println("Digite sua senha: ");
            senhaDigitada = input.nextLine();

        }while ((!senhaCorreta.equals(senhaDigitada))); //Condição de saída: senhas se tornam iguais, enquanto a senha digitada for diferente da senha correta ele continua

        if (senhaCorreta.equals(senhaDigitada)) // equal compara string, bom lembrar!!!
        {
            System.out.println("================================");
            System.out.println("senha correta, Acesso concedido");
            System.out.println("================================");
        }
        input.close();
    }

}
