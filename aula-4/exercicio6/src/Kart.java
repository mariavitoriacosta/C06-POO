public class Kart {
    String nome;
    Motor motor;
    Piloto piloto;

    public Kart() {
        motor = new Motor();
    }

    void pular(){
        System.out.println("Carro " + nome + " esta pulando!");
    }

    void soltarTudo(){
        System.out.println("Carro " + nome + " esta soltando turbo!");
    }

    void fazerDrift(){
        System.out.println("Carro " + nome + "esta dando drift!");
    }
}
