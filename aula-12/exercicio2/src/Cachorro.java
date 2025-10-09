public class Cachorro extends Mamifero{
    public Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro " +this.nome+ " late");
    }

    @Override
    public int compareTo(Mamifero o) {
        if(this.vida < o.vida){
            return 1;
        }
        if(this.vida > o.vida){
            return -1;
        }
        return 0;
    }
}
