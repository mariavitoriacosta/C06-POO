//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cantina cantina = new Cantina();
        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        cantina.nome = "Cantina do Inatel";

        salgado1.nome = "Coxinha";
        salgado2.nome = "Cigarrete";
        salgado3.nome = "Pastel";

        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);

        cantina.mostraInfo();
    }
}