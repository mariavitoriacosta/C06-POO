import br.inatel.cdg.Cliente;
import br.inatel.cdg.Conta;

public class Main {

    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[2];
        Conta conta = new Conta(clientes);

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Mavi");
        cliente1.setCpf(124522146);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Marcelo");
        cliente2.setCpf(1234567890);

        clientes[0] = cliente1;
        clientes[1] = cliente2;

        conta.setLimite(750);
        conta.setNumero(5342);

        System.out.println(conta.getSaldo());

        conta.deposita(100);

        System.out.println(conta.getSaldo());

        conta.sacar(20);

        System.out.println(conta.getSaldo());

        conta.sacar(735);
    }

}
