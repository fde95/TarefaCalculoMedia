/**
 * @author felipe.espinoza
 * @version 1.0
 */

public class TarefaCalculoMedia {
    public static void main (String[] args){
        calculoMedia();
    }

    private static void calculoMedia() {
        int notaPortugues = 7;
        int notaMatematica = 7;
        int notaQuimica = 8;
        int notaGeografia = 8;
        float somaNotas = notaGeografia + notaMatematica + notaPortugues + notaQuimica;
        float resultadoMedia = somaNotas/4;

        if (resultadoMedia >= 7 && resultadoMedia <= 10){
            System.out.println("Sua média é de " + resultadoMedia + ".\nVocê esta aprovado!");
        } else {
            System.out.println("A sua média foi de " + resultadoMedia + ".\nVocê esta reprovado!");
        }
    }
}
