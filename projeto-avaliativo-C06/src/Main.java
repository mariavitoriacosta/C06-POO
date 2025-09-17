import cliente.Cliente;
import cliente.ProcessarPedido;
import computador.Computador;
import computador.HardwareBasico;
import computador.MemoriaUSB;
import computador.SistemaOperacional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SistemaOperacional sistemaOperacional1 = new SistemaOperacional(64, "macOS Sequoia");
        SistemaOperacional sistemaOperacional2 = new SistemaOperacional(64, "Windows 8");
        SistemaOperacional sistemaOperacional3 = new SistemaOperacional(64, "Windows 10");

        HardwareBasico[] hardwareBasico1 = new HardwareBasico[3];
        hardwareBasico1[0] = new HardwareBasico("Pentium Core i3 - Mhz", 2200);
        hardwareBasico1[1] = new HardwareBasico("Memória RAM - Gb", 8);
        hardwareBasico1[2] = new HardwareBasico("HD - Gb", 500);

        HardwareBasico[] hardwareBasico2 = new HardwareBasico[3];
        hardwareBasico2[0] = new HardwareBasico("Pentium Core i5 - Mhz", 3370);
        hardwareBasico2[1] = new HardwareBasico("Memória RAM - Gb", 16);
        hardwareBasico2[2] = new HardwareBasico("HD - Tb", 1);

        HardwareBasico[] hardwareBasico3 = new HardwareBasico[3];
        hardwareBasico3[0] = new HardwareBasico("Pentium Core i7 - Mhz", 4500);
        hardwareBasico3[1] = new HardwareBasico("Memória RAM - Gb", 32);
        hardwareBasico3[2] = new HardwareBasico("HD - Tb", 2);

        MemoriaUSB memoriaUSB1 = new MemoriaUSB("Pen-drive - Gb ", 16);
        MemoriaUSB memoriaUSB2 = new MemoriaUSB("Pen-drive - Gb ", 32);
        MemoriaUSB memoriaUSB3 = new MemoriaUSB("HD Externo - Tb ", 1);

        Computador[] clienteComputadores = new Computador[20];

        Computador computador1 = new Computador("Apple", 492, sistemaOperacional1, hardwareBasico1);
        Computador computador2 = new Computador("Samsung", 1726, sistemaOperacional2, hardwareBasico2);
        Computador computador3 = new Computador("Dell", 6170, sistemaOperacional3, hardwareBasico3);

        computador1.addMemoriaUSB(memoriaUSB1);
        computador2.addMemoriaUSB(memoriaUSB2);
        computador3.addMemoriaUSB(memoriaUSB3);

        System.out.println("Bem-vindo(a) à PC Mania!");
        System.out.println(" ");
        System.out.println("Promoções de PC's disponíveis: ");
        System.out.println(" ");
        System.out.println("Promoção 1: ");
        computador1.mostraPCConfigs();
        System.out.println(" ");
        System.out.println("Promoção 2: ");
        computador2.mostraPCConfigs();
        System.out.println(" ");
        System.out.println("Promoção 3: ");
        computador3.mostraPCConfigs();
        System.out.println(" ");
        System.out.println("Preencha os campos para prosseguir com a sua compra.");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Nome: ");
        String nomeCliente = entrada.next();

        System.out.println("CPF: ");
        String cpfCliente = entrada.next();

        Cliente cliente1 = new Cliente(nomeCliente, cpfCliente);

        System.out.println("Obrigado, você já pode prosseguir!");
        System.out.println("""

                Digite:
                1 - Adquirir Promoção 1
                2 - Adquirir Promoção 2
                3 - Adquirir Promoção 3
                0 - Finalizar compra
                """);

        int opcao;

        do{
            opcao = entrada.nextInt();
            if(opcao == 1){
                for(int i = 0; i < 20; i++){
                    if(clienteComputadores[i] == null) {
                        clienteComputadores[i] = computador1;
                        break;
                    }
                }
            }
            if(opcao == 2){
                for(int i = 0; i < 20; i++){
                    if(clienteComputadores[i] == null) {
                        clienteComputadores[i] = computador2;
                        break;
                    }
                }
            }
            if(opcao == 3) {
                for(int i = 0; i < 20; i++){
                    if(clienteComputadores[i] == null) {
                        clienteComputadores[i] = computador3;
                        break;
                    }
                }
            }
        } while(opcao != 0);

        ProcessarPedido processarPedido = new ProcessarPedido();

        processarPedido.enviarPedido(clienteComputadores, cliente1);

        System.out.println(" ");
        System.out.println("Dados do cliente: ");
        System.out.println("Nome: " +nomeCliente);
        System.out.println("CPF: " +cpfCliente);
        System.out.println(" ");
        System.out.println("PC's adiquiridos: ");
        for(Computador computador : cliente1.getComputadores()){
            if(computador == null){
                break;
            }
            System.out.println(computador.getMarca());
        }
        System.out.println(" ");
        System.out.println("Total da compra: R$ " +cliente1.calculaTotalCompra());
        System.out.println(" ");
        System.out.println("Obrigado pela preferência!");
    }

}