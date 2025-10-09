public class Boi extends Mamifero{
    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("O boi " +this.nome+ " muge");
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
