import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Double> listaNumeros = new ArrayList();
        Random rand = new Random();
        boolean reverse;

        listaNumeros.add(rand.nextDouble());
        listaNumeros.add(rand.nextDouble());
        listaNumeros.add(rand.nextDouble());
        listaNumeros.add(rand.nextDouble());
        listaNumeros.add(rand.nextDouble());
        listaNumeros.add(rand.nextDouble());

        Collections.sort(listaNumeros, Collections.reverseOrder());

        for(int i = 0; i < listaNumeros.size(); i++){
            System.out.println(listaNumeros.get(i));
        }
    }
}