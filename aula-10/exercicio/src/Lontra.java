public class Lontra extends Mamifero implements Aquatico {
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("A lontra " +this.nome+ " guincha");
    }

    @Override
    public void nadar() {
        System.out.println("A lontra é um mamífero que nada!");
    }
}
