import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a sua media NPA: ");
        int npa = entrada.nextInt();

        if(npa >= 60){
            System.out.println("Você foi aprovado!");
        } else if (npa >= 30 && npa < 60) {

            System.out.println("Você ficou de NP3 :( ");
            System.out.println("Entre com sua nota NP3:");

            int np3 = entrada.nextInt();
            float media = (float) (npa + np3)/2;

            if(media >= 50) {
                System.out.println("Você foi aprovado!");
            } else {
                System.out.println("Você foi reprovado :(" );
            }
        } else if (npa < 30) {
            System.out.println("Você foi reprovado");
        }

        entrada.close();

    }

}
