package academy.devdojo.maratonaJavaIntroducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // 8 tipos de variaveis primitivas, int,double,float,char,byte,short,long,boolean
        int variavelUm =10;
        double salario = 2000;
        float salFloat = 2500;
        byte idade =12;
        short idadeShort = 10;
        boolean verdade = true;
        boolean falso = false;
        long numeroGrande = 1000000;
        char  caracteres = 'm'; // -> aspas simples para caracteres unicos
        String nome = "carlos"; // -> String é uma classe então primeira letra maiscula, e ela tem aspas duplas pra frases
        System.out.println("a idade é " + variavelUm + " anos");
        System.out.println(verdade);
        System.out.println(falso);
        System.out.println("olá, meu nome é "+ nome);
    }
}
