package computador;

public class Computador {
    private String marca;
    private float preco;
    private SistemaOperacional sistemaOperacional;
    private HardwareBasico[] hardwareBasico;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, SistemaOperacional sistemaOperacional, HardwareBasico[] hardwareBasico) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = sistemaOperacional;
        this.hardwareBasico = hardwareBasico;
    }

    public float getPreco() {
        return preco;
    }

    public String getMarca() {
        return marca;
    }

    public void mostraPCConfigs(){
        System.out.println("Marca: " +marca);
        System.out.println("Preço: R$ " +preco);
        System.out.println("Sistema operacional: " +sistemaOperacional.getNome()+ " " +sistemaOperacional.getTipo()+ " bits");
        for(HardwareBasico hardware : hardwareBasico){
            if(hardware == null){
                break;
            }
            System.out.println(hardware.getNome()+ " " +hardware.getCapacidade());
        }
        System.out.println("Memória USB: " +memoriaUSB.getNome()+ " " +memoriaUSB.getCapacidade()+ " Gb/Tb");
    }
    public void addMemoriaUSB(MemoriaUSB musb){
        this.memoriaUSB = musb;
    }
}
