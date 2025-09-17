package cliente;
import computador.Computador;

public class ProcessarPedido {

    public static void enviarPedido(Computador[] computadores, Cliente cliente) {
        cliente.setComputadores(computadores);
        System.out.println("Pedido enviado com sucesso!");
    }
}