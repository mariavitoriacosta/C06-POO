import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        boolean [][] campo = new boolean[2][2];
        boolean ganhou = true;

        int bombaX = rand.nextInt(2);
        int bombaY = rand.nextInt(2);

        campo[bombaX][bombaY] = true;

        System.out.println("Bem-vindo ao Campo Minado!");
        System.out.println("Digite a posição X e Y para jogar:");

        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            int digitadoX = entrada.nextInt();
            int digitadoY = entrada.nextInt();
            if(campo[digitadoX][digitadoY] == true) {
                System.out.println("Você explodiu :( Tente mais tarde!");
                ganhou = false;
                break;
            }
            else if(i != 2){
                System.out.println("Você está salvo! Por enquanto...");
            }
        }

        if(ganhou == true){
            System.out.println("Você ganhou! Parabéns!!");
        }

    }
}