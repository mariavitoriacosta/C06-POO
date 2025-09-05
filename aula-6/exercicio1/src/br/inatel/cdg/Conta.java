package br.inatel.cdg;

public class Conta {

    private int numero;
    private float saldo;
    private float limite;
    private Cliente[] clientes;

    public Conta(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public void sacar(float quantia){
        if(saldo >= quantia) {
            this.saldo -= quantia;
        } else{
            System.out.println("Saldo insufuciente");
        }
    }

    public void deposita(float quantia){
        this.saldo += quantia;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setClientes() {
        this.clientes = clientes;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

