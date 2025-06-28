package academy.devdojo.exerciciosFixacao;

public class ExercicioSomDeImpares {
    public static void main(String[] args) {
        int somTotal = 0;
        for (int i =0; i <= 100; i++){
        if (i % 2 == 1){ somTotal +=i;}
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("calculando a soma de todos os numeros impares de 1 a 100....");
        System.out.println("Soma de todos os números ímpares de 1 a 100: "+ somTotal);
        System.out.println("--------------------------------------------------------------");
    }

}
