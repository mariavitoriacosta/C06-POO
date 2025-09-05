import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Asteroide asteroide1 = new Asteroide("Chris", "Pequeno");
        Asteroide asteroide2 = new Asteroide("Marcelo", "Grande");

        Nave nave1 = new Nave(100, "Normal", "Maria");
        Nave nave2 = new Nave(100, "Explosivo", "Vitória");

        nave1.atirar(asteroide2);
        nave1.atirar(asteroide1);
        nave2.atirar(asteroide2);
    }
}