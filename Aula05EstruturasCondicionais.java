public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 18;
        boolean isAutorizadoBeber = idade >= 18;
        //!
        if (isAutorizadoBeber) {
            System.out.println("Pode beber hahahahahahahahhaa");
        }
        if (!isAutorizadoBeber) {
            System.out.println("pode nao dog slk");
        }
        boolean c = false;
        if (c = true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        int idade1 = 18;
        boolean isAutorizadoEntrar = idade1 >= 18;

        if (isAutorizadoEntrar) {
            System.out.println("Pode entrar");
        } else {
            System.out.println("Pode naooooo");
        }

        int idade2 = 12;
        boolean temDocumento = true;

        if (idade2 >= 18 && temDocumento) {
            System.out.println("Entra");
        } else {
            System.out.println("Nao entra");
        }


    }
}
