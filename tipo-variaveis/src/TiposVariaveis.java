public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Tipos primitivos
        // Estudem a classe String que representa texto na aplicação

        String meuNome = "Fulano de Tal";
        
        byte idade = 30;
        short ano = 2021;
        int cep = 12345678;
        long cpf = 12345678901l;
        float pi = 3.14f;
        double salario = 1275.50;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_PI = 3.14;

    }
}
