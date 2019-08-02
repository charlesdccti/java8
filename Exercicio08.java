import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Consumer;


public class Exercicio08 {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        palavras.add("Bora programar!");
        palavras.add("Java");
        palavras.add("Charles Ferreira");

        Consumer<String> consumidor = new ImprimirNaLinha();
        palavras.forEach(consumidor); // -> Novo default method forEach
    }
}


class ImprimirNaLinha implements Consumer<String>{
    
    public void accept(String s) {
        System.out.println(s);
    }
}