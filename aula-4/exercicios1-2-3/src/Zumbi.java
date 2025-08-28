public class Zumbi {
    double vida;
    float velocidade;
    boolean isAlive = true;
    String nome;

    void morder()
    {
        System.out.println("O zumbi mordeu");
    }

    void matarZumbiInimigo(Zumbi zumbiInimigo)
    {
        zumbiInimigo.isAlive = false;
    }

    double adicionaVerificaVida(double vida)
    {
        this.vida += vida;
        return this.vida;
    }

    double mostrarVida()
    {
        return this.vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia)
    {
        this.vida -= quantia;
        zumbiAlvo.vida += quantia;
    }

}

