public class Lontra extends Mamifero {
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("A lontra " +this.nome+ " guincha");
    }
}
