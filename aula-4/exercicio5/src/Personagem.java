public class Personagem {
    String nome;
    int pontos;
    Arma arma;

    void tomarDano(){
        pontos -= 5;
    }

    void usarArma(){
        arma.resistencia-= 2;
    }
}
