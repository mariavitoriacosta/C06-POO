public class Banda {
    private String nome;
    private String genero;
    Musica[] musicas = new Musica[10];
    Membro[] membros = new Membro[5];

    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public void mostraInfo(){
        System.out.println("A banda " +nome+ " é composta pelos seguintes membros e tem as seguintes musicas ");
        System.out.println("Membros: ");
        for(Membro membro : membros){
            if(membro == null){
                break;
            }
            System.out.println(membro.nome);
        }
        System.out.println("Musicas: ");
        for(Musica musica : musicas){
            if(musica == null){
                break;
            }
            System.out.println(musica.nome);
        }

    }

    public void addMusicaNova(Musica musica){
        for(int i = 0; i < 10; i++){
            if(musicas[i] == null){
                musicas[i] = musica;
                break;
            }
        }
    }

    public void addMembroNovo(Membro membro){
        for(int i = 0; i < 5; i++){
            if(membros[i] == null){
                membros[i] = membro;
                break;
            }
        }
    }
}
