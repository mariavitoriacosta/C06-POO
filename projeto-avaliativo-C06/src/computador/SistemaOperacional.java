package computador;

public class SistemaOperacional {
    private String nome;
    private int tipo;

    public SistemaOperacional(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
}
