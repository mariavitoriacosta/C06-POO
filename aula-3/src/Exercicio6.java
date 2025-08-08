import java.util.Scanner;
import java.util.Random;


public class Exercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();

        int numGerado, numAdivinhado;

        numGerado = rand.nextInt(10);

        do {
            System.out.println("Qual número estou pensando?");
            numAdivinhado = entrada.nextInt();
            if(numAdivinhado < numGerado)
                System.out.println("O meu número é maior!");
            else if(numGerado > numAdivinhado)
                        System.out.println("O meu número é menor!");
        } while (numGerado != numAdivinhado);

        System.out.println("Parabéns! Você acertou.");

        entrada.close();

    }
}
