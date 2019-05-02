import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio05 {

    public static void main(String[] args) {
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");

        // transformar todos os paises para letras maiusculas e concatenar em uma string utilizando join por , com java 8
        List<String> maiuscula = G7.stream()
                .map(a -> a.toUpperCase())
                .collect(Collectors.toList());

        System.out.println( String.join(",", maiuscula) );
    }
}