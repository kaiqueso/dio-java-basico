public class Operadores {
    public static void main(String[] args) throws Exception {
        // operador de atribuicao
        int numero = 10;

        // operadores aritméticos
        double soma = 10.4 + 5.2;
        int subtracao = 113 - 25;
        int multiplicacao = 10 * 5;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado =  (10 * 7) + (20 / 4);

        // operador de concatenação
        String nomeCompleto = "João" + " " + "Silva";

        String concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        // operadores unários
        int num = 5;
        System.out.println(-num);

        num = -num;
        System.out.println(num);

        num = num * -1;
        System.out.println(num);

        boolean variavel = true;
        System.out.println(!variavel);

        // operador ternário
        int a = 5, b = 6;
        String resul = "";

        if (a==b)
            resul = "verdadeiro";
        else
            resul = "falso";
            
        System.out.println(resul);

        b = 5;

        System.out.println(a==b ? "verdadeiro" : "falso");

        // operadores relacionais
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println(simNao);

        simNao = numero1 != numero2;
        System.out.println(simNao);
        
        simNao = numero1 > numero2;
        System.out.println(simNao);

        simNao = numero1 < numero2;
        System.out.println(simNao);

        String nomeUm = "João";
        String nomeDois = "João";

        System.out.println(nomeUm == nomeDois);

        String nomeTres = new String("João");

        System.out.println(nomeUm.equals(nomeTres));

        // operadores lógicos

        boolean condicao1 = true;

        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
        
        if (condicao1 || condicao2) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
    }
}
