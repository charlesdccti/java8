import java.util.Arrays;
import java.util.List;

public class Exercicio03 {

    public static void main(String[] args) {
        List<Pessoa> costBeforeTax = Arrays.asList(new Pessoa("João", 2531.0), new Pessoa("José", 1600.0), new Pessoa("Nicolas", 2810.0));

        /*for (Pessoa p : costBeforeTax) {
            double inss = p.salario * 5 / 100;
            System.out.println( inss );
        }*/

        // reescrever usando lambdas
        costBeforeTax.forEach( p -> System.out.println( p.salario * 5 / 100 ) );
    }
}

class Pessoa {
    String nome;
    Double salario;

    public Pessoa(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}