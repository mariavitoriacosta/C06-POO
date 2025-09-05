//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banda banda = new Banda("Divas Babilonicas", "Pop");

        Membro membro1 = new Membro("Taylor Swift", "Vocalista");
        Membro membro2 = new Membro("Sabrina Carpenter", "Vocalista");

        Musica musica1 = new Musica("Manchild", 3.33);
        Musica musica2 = new Musica("End Game", 4.04);

        Empresario empresario = new Empresario("Jack Antonoff", 123456);

        banda.addMembroNovo(membro1);
        banda.addMembroNovo(membro2);

        banda.addMusicaNova(musica1);
        banda.addMusicaNova(musica2);

        banda.mostraInfo();

    }
}