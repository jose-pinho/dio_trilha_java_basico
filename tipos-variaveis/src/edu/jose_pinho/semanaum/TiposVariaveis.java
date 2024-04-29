package edu.jose_pinho.semanaum;
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        String meuNome="José Augusto";
        
        double salarioMinimo = 2500;

        short numeroCurto =1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.print(numero);

        final double VALOR_DE_PI = 3.14;//"final" transforma variavel em constante = Por convenção constante são escritas em caixa alta;
        System.out.print(VALOR_DE_PI);
    }
}
