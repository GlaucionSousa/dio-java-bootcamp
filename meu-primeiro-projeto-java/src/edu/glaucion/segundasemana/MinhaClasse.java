package edu.glaucion.segundasemana;

public class MinhaClasse {
    public static void main(String[] args) {

        //Tipos de Variaveis que não alterão seu valor

        final int ESTADOS_BRASILEIROS = 27;
        final double PI = 3.14;
        final int ANO_2000 = 2000;
        final String BR = "Brasil";

       //Declaração invalidas de variaveis:
       //int numero&um = 1; -> Os unicos símblos permitidos são _ e $
       //int 1numero = 1; -> Uma variável não pode inciar com número
       //int numero um = 1; -> Não pode ter espaço no nome da variável
       //int long = 1; -> "long" faz parte das palavras reservadas da linguagem

        // Declaração válida de veriáveis
        int numero$um = 1;
        int numero1 = 1;
        int numeroum = 1;
        int longo = 1;
        
        //Tipos de Variáveis:
        String meuNome = "Glaucion";
        int anoFabricacao = 2024;
        boolean verdadeiro = false;
        
        //Metodos
        String primeiroNome = "Glaucion";
        String segundoNome = "Silva de Sousa";
        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

        System.out.print (BR);
        System.out.print (PI);
        System.out.print (ESTADOS_BRASILEIROS);
        System.out.print (ANO_2000);
        System.out.print (numero$um);
        System.out.print (numero1);
        System.out.print (numeroum);
        System.out.print (longo);
        System.out.print (meuNome);
        System.out.print (anoFabricacao);
        System.out.print (verdadeiro);
        System.out.println(nomeCompleto);
        
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);        
    }
}
