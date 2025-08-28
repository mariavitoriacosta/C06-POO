//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        kart1.nome = "Kart 1";
        kart2.nome = "Kart 2";

        kart1.motor.cilindradas = "150";
        kart1.motor.velocidadeMaxima = 70;

        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        piloto1.nome = "Piloto 1";
        piloto2.nome = "Pilito 2";

        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        piloto1.soltaSuperPoder();
        kart2.fazerDrift();

    }
}