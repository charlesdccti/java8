import java.util.Arrays;
import java.util.List;

public class Exercicio02 {

    public static void main(String[] args) {
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);

        /*for (Integer cost : costBeforeTax) {
            double price = cost + .12*cost;
            System.out.println(price);
        }*/

        // reescrever usando lambdas
        costBeforeTax.forEach(cost -> System.out.println( cost + .12*cost ));
    }
}