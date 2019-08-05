import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Curso {
    String nome;
    int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }

}

public class MainCurso {

    public static void main(String[] args) {
        List<Curso> cursos = Arrays.asList(
            new Curso("Python", 45),
            new Curso("JavaScript", 150),
            new Curso("Java", 113),
            new Curso("C", 55));

        //cursos.stream().forEach(c -> System.out.println(c.getNome()));

        cursos.sort(Comparator.comparingInt(Curso::getAlunos));

        cursos.stream()
            .filter(c -> c.getAlunos() > 50)
            .forEach(c -> System.out.println(c.getNome()));

        //Stream<String> nomes = cursos.stream().map(Curso::getNome);

        // cursos.stream()
        // .filter(c -> c.getAlunos() > 50)
        // .map(c -> c.getAlunos())
        // .forEach(x -> System.out.println(x));

        cursos.stream()
            .filter(c -> c.getAlunos() > 50)
            .map(Curso::getAlunos)
            .forEach(System.out::println);
        
        
       cursos.stream()
	       .filter(c -> c.getAlunos() >= 100)
	       .mapToInt(Curso::getAlunos)
	       .average();
        
       
       cursos.stream()
            .filter(c -> c.getAlunos() >= 100)
            .findAny()
            .ifPresent(c -> System.out.println(c.getNome()));
       
       
       List<Curso> resultado = cursos.stream()
    		   .filter(c -> c.getAlunos() > 100)
    		   .collect(Collectors.toList());
       
       
       Map<String, Integer> map = cursos.stream()
       		.filter(c -> c.getAlunos() >= 100)
       		.collect(Collectors.toMap(
       				c -> c.getNome(),
       				c -> c.getAlunos()));
       		
       System.out.println(map);
       
       
    }
}






































