public class Aula05EstruturaCondicional02 {
    public static void main(String[] args) {

        int idade = 17;
        String categoria;

        if (idade <= 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade <= 18) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulto");
        }
    }
}
