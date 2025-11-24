import java.util.Scanner;

public class EstudosAlone001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite seu salario: ");
        float salario = sc.nextFloat();

        System.out.println("Olá " + nome + ", Sua idade é " + idade + " anos e seu salario é: " + salario);

        sc.close();



    }
}
