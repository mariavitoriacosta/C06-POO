public class Lontra extends Mamifero {
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("A lontra " +this.nome+ " guincha");
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