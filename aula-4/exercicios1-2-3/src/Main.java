public class Main {

    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 100;
        z1.velocidade = 20;
        z1.nome = "marcelo";

        z2.vida = 80;
        z2.velocidade = 30;
        z2.nome = "mavi";

        z1 = z2;
        System.out.println(z1.nome + z2.nome);

        System.out.println(z1.velocidade);
        System.out.println(z2.velocidade);

        z1.morder();
        z1.matarZumbiInimigo(z2);


        double vidaZ1 = z1.adicionaVerificaVida(50);
        System.out.println(vidaZ1);
        System.out.println("A vida do zumbi " +z1.nome + " é: "+z1.mostrarVida());

        z1.transfereVida(z2, 20);
        System.out.println("A vida do zumbi " +z1.nome+ " agora é: " + z1.vida);
        System.out.println("A vida do zumbi " +z2.nome+ " agora é: " + z2.vida);
    }

}
