//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cachorro Cachorro = new Cachorro("Molly", 4);
        Lontra Lontra = new Lontra("Bernardina", 20);
        Boi Boi = new Boi("Margarida", 15);

        Cachorro.emitirSom();
        Lontra.emitirSom();
        Boi.emitirSom();

        Cachorro.mostraInfo();
        Lontra.mostraInfo();
        Boi.mostraInfo();
    }
}