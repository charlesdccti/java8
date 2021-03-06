import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @see Filtrar lista e colecoes com stream do java8 
 * @author charles
 *
 */
public class Exercicio01 {

	public static void main(String args[]) {
		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

		// filtrar todos os nomes que iniciam com J
		languages.stream()
					.filter(l -> l.toUpperCase()
											.startsWith("J"))
														.forEach(System.out::println);

		// filtrar todos os nomes que possuem mais de 5 caracteres
		languages.stream().filter(l -> l.length() > 5)
												.forEach(System.out::println);

		// Transformar esta lista em uma lista de inteiros contendo o tamanho de cada
		// palavra e imprimir
		List<Integer> collect = languages.stream().map(l -> l.length()).collect(Collectors.toList());

		collect.forEach(System.out::println);
	}
}