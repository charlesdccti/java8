import java.util.ArrayList;
import java.util.List;

public class Lambdas {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        palavras.add("Bora programar!");
        palavras.add("Java");
        palavras.add("Charles Ferreira");

        // palavras.forEach(new Consumer<String>(){
        // public void accept(String palavra) {
        // System.out.println(palavra);
        // }
        // });

        palavras.forEach(s -> System.out.println(s));

        /**
         * Uso de "classe anonimas" como parametro do "Method Defaout" sort()
         */
        // palavras.sort(new Comparator<String>() {
        // @Override
        // public int compare(String s1, String s2) {
        // if(s1.length() < s2.length())
        // return -1;
        // if(s1.length() > s2.length())
        // return 1;
        // return 0;
        // }
        // });

        // palavras.sort((s1, s2) -> {
        // if (s1.length() < s2.length())
        // return -1;
        // if (s1.length() > s2.length())
        // return 1;
        // return 0;
        // });

        // palavras.sort((s1, s2) -> {
        // return Integer.compare(s1.length(), s2.length());
        // });

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        palavras.sort((s1, s2) -> s1.length() - s2.length());

        // new Thread(new Runnable() {

        // @Override
        // public void run() {
        // System.out.println("Executando um Runnable");
        // }

        // }).start();

        new Thread(() -> System.out.println("Executando um Runnable")).start();

    }
}