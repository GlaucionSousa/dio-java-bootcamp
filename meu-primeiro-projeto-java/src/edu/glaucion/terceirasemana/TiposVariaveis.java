package edu.glaucion.terceirasemana;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salario = 1275.33; //tipo "double" valores com milhares não possui "."
                                 // ou ",", mas o "." no valor exibi a parte fracionada;
        // TiposEVariaveis.java
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        //Variáveis e Constantes
        //Toda variável constante "final" tem que ser declarada em caixa alta, isso indica que o valor não mudará
        final double VALOR_DE_PI = 3.14;

        //Estudar os tipos promitivos e
        //Classe String que representa texto na aplicação.

        String meuNome = "Glaucion Sousa";
    }
}
