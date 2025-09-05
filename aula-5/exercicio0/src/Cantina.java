public class Cantina {
    String nome;
    Salgado[] salgados = new Salgado[30];

    void addSalgado(Salgado novoSalgado){
        for(int i = 0; i < 30; i++){
            if(salgados[i] == null){
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    void mostraInfo(){
        System.out.println("A " + nome + " possui os seguintes salgados: ");
        System.out.println("Salgados: ");
        for(Salgado salgado : salgados){
            if(salgado == null){
                break;
            }
            System.out.println(salgado.nome);
        }
    }
}

