import java.util.Arrays;
import java.util.List;

public class Exercicio04 {

    public static void main(String[] args) {
        List<Usuario> usuarios = Arrays.asList(
                new Usuario("maikon", false),
                new Usuario("jose", false),
                new Usuario("paulo", true),
                new Usuario("ronaldo", true));

        // Criar uma nova lista de usuários ativos e imprimir usando java 8 e forEach
        usuarios.stream()
                .filter(usuario -> usuario.ativo)
                .forEach( u -> System.out.println(u.usuario) );
    }
}

class Usuario {
    String usuario;
    Boolean ativo;

    public Usuario(String usuario, Boolean ativo) {
        this.usuario = usuario;
        this.ativo = ativo;
    }
}