package br.inatel.cdg.jogador;
import br.inatel.cdg.inimigo.Asteroide;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(double vida, String tipoTiro, String nome) {
        this.vida = vida;
        this.tipoTiro = tipoTiro;
        this.nome = nome;
    }

    public void atirar (Asteroide ast){
        System.out.println("A nave " + this.nome + " atirou");
        if(ast.getTipoAsteroide().equals("Pequeno")){
          ast.destruir();
        } else {
            if(this.tipoTiro.equals("Normal")){
                System.out.println("O asteroide " +ast.getNome()+ " não foi destruído");
            } else{
                ast.destruir();
            }
        }
    }
}
