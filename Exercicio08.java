import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Exercicio08 {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        palavras.add("Bora programar!");
        palavras.add("Java");
        palavras.add("Charles Ferreira");

        // Consumer<String> consumidor = new ImprimirNaLinha();
        // palavras.forEach(consumidor); // -> Novo default method forEach

        // Comparator<? super String> comparador = new ComparadorPorTamanho();
        // palavras.sort(comparador);
        // System.out.println(palavras);

        // palavras.forEach(new Consumer<String>(){
        // public void accept(String palavra) {
        // System.out.println(palavra);
        // }
        // });

        palavras.forEach(s -> System.out.println(s));
    }
}

class ImprimirNaLinha implements Consumer<String> {

    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
    }
}