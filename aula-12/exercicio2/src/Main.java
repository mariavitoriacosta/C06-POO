import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Mamifero> listaMamiferos = new ArrayList<>();

        Cachorro Cachorro1 = new Cachorro("Molly", 4);
        Lontra Lontra1 = new Lontra("Bernardina", 20);
        Boi Boi1 = new Boi("Margarida", 15);
        Cachorro Cachorro2 = new Cachorro("Cristal", 10);
        Lontra Lontra2 = new Lontra("Augustina", 25);
        Boi Boi2 = new Boi("Rosa", 18);

        listaMamiferos.add(Cachorro1);
        listaMamiferos.add(Cachorro2);
        listaMamiferos.add(Lontra1);
        listaMamiferos.add(Lontra2);
        listaMamiferos.add(Boi1);
        listaMamiferos.add(Boi2);

        Collections.sort(listaMamiferos);

        for(Mamifero mamifero : listaMamiferos){
            System.out.println(mamifero.nome+ ": " +mamifero.vida);
        }
    }
}