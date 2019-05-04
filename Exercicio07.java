import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Exercicio07 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        // Usando java 8 retire estatisticas da lista como maximo, minimo, soma e média
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println( stats.getMax() );
        System.out.println( stats.getMin() );
        System.out.println( stats.getSum() );
        System.out.println( stats.getAverage() );
        System.out.println( stats.getCount() );
    }
}