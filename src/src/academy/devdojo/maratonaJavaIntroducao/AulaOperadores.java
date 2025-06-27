package academy.devdojo.maratonaJavaIntroducao;

public class AulaOperadores {
    public static void main(String[] args) {
        int n1 = 10;
        //int n2 = 20;
       double n2 = 20;
       //operadores basicos java: +,-,*,/

        System.out.println(n2 - n1);
        System.out.println("Valor: "+n2 + n1); // se for só n2 +n1 ele soma, se tiver uma string junto ele concatena
        System.out.println(n2+n1 + " valor é: "); // ele primeiro identifica numeros inteiros e depois strings, e só depois das strings q ele entende que o + concatena
        double resultado = n2 + n1;
        System.out.println(resultado);
        double div = n1/n2; // não vemos o 0.5 pois a divisão entre dois numeros inteiros sempre resultara em um valor inteiro, tem que ter ao menos um double pra ver a divisão depois da virgula
        System.out.println(div);


        // % resto da divisão
        int resto = 20 % 2;
        System.out.println(resto);
        //operadores logicos: retornam valor booleano, sempre true ou false
        // < e >
        // <= e >=
        // == e !=
        // tipo boleano sempre vem o is antes do nome da variavel
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte =10 < 20;
        System.out.println("is dez maior que vinte: "+ isDezMaiorQueVinte);
        System.out.println("is des menor que vinte "+ isDezMenorQueVinte);

        // && (and) || (or)
        int idade = 36;
        float salario = 3300F;
        boolean isDentroLei = idade > 38 && salario > 4612;

    }
}
