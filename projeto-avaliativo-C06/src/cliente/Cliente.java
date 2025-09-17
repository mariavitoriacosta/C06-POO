package cliente;

import computador.Computador;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores;

    public void setComputadores(Computador[] computadores) {
        this.computadores = computadores;
    }

    public Computador[] getComputadores() {
        return computadores;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra(){
        float total = 0;
        for(Computador computador : computadores){
            if(computador == null){
                break;
            }
            total += computador.getPreco();
        }
        return total;
    }
}
