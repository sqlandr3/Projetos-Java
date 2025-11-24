import java.util.Scanner;

public class jogoDaForca {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] words = {"Java", "Teclado", "Hardware", "Matemática", "Teclado", "Python"};
        String palavraSecreta = words[(int)(Math.random() * words.length)];

        char[] escondida = new char[palavraSecreta.length()];

        for (int i = 0; i < escondida.length; i++) {
            escondida[i] = '_';
        }

        System.out.println(escondida);

        System.out.print("Digite uma letra: ");
        char tentativa = sc.next().toUpperCase().charAt(0);


        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (palavraSecreta.toUpperCase().charAt(i) == tentativa) {
                escondida[i] = tentativa;
            }
        }

    }
}
