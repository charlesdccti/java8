import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Consumer;


public class Lambdas {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        palavras.add("Bora programar!");
        palavras.add("Java");
        palavras.add("Charles Ferreira");

        /**
         * Uso de "classe anonimas" consumer<String> como parametro do "Method Defaout" forEach()
         */
        palavras.forEach(new Consumer<String>(){
            public void accept(String palavra) {
                System.out.println(palavra);
            }
        });

        palavras.forEach(s -> System.out.println(s));

        /**
         * Uso da funcao lambda no metodo sort()
         */
        palavras.sort((s1, s2) -> {
            return Integer.compare(s1.length(), s2.length()); 
        });

        palavras.sort(Comparator.comparing(s -> s.length()));

        /**
         * Escrevendo o comparing com method reference
         */
        palavras.sort(Comparator.comparing(String::length));

     
    }
}