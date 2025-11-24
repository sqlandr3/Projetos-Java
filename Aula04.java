public class Aula04 {
    public static void main(String[] args) {
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

        //&&(and) || (or) ! (
        int idade = 23;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 6000;
        float valorPlaystation = 5000f;

        boolean isPlaystation5Compravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystation5Compravel " + isPlaystation5Compravel);

        // = += -= /= %=
        double bonus = 1800;
        bonus = bonus -= 1000;
        bonus = bonus += 1000;
        bonus = bonus *= 2;
        bonus = bonus /= 2;
        bonus = bonus %= 2;
        System.out.println("bonus " + bonus);

        //
        int contador = 0;
        contador += 1;
        contador--;
        contador++;
        ++contador;
        --contador;
        int contador2 = 0;
        contador2++;
        System.out.println("contador " + contador2);
        System.out.println("contador2 " + contador2++);
    }
}
