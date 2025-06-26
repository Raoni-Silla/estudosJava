package academy.devdojo.maratonaJavaIntroducao;

/**
 * Prática, crie variaveis para os campos descritos abaixo entre <> e imprima o seguinte
 * eu <nome>, morando no  <endereço> confirmo que recebi o <salario>, na <data>
 */
public class ExTiposPrimitivos {
    public static void main(String[] args) {
        String nome = "Raoní";
        String nomeRua = "av rui barbosa";
        int numeroCasa = 1217;
        double sal = 2.533;
        String dataRecebimentoSal = "26/06/2025";
        String relatorio = "eu " + nome + ", morando na rua " + nomeRua + " com o endereço de " + numeroCasa + " confirmo que recebi o salario de "+ sal + " na data de " + dataRecebimentoSal;
        System.out.println(relatorio);
    }
}
