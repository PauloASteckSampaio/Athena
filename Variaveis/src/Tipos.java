public class Tipos {
    public static void main(String[] args) {
        // A Variável int representa o tipo números inteiros. Dentro dela se colocam
        //Números que não possuam ponto flutuante(vírgula).
        int idade = 24;
        System.out.println(idade);

        // O double representa uma variável de numero com ponto flutuante. Nela se colocam
        //números que possuem vírgula. Caso seja colocado um número inteiro dentro desta
        // variável, o número irá receber automaticamente uma vírgula.
        double numero1 = 3.21;
        double numero2 = 8;
        System.out.println(numero1);
        System.out.println(numero2);

        // Utilizando-se de variáveis é possível de se realizar operações aritméticas.
        // + realiza somas e concatenações. Uma concatenação é quando ao invés de se somar algo,
        // duas coisas se juntam. Como duas frases out até mesmo 2 números podendo ser exibidos
        // lado a lado.
        // - realiza operações de subtração.
        // * o asterisco realiza operações de multiplicação
        // / a barra realiza operações de divisão
        System.out.println(numero1 + numero2);
        System.out.println(numero1 - numero2);
        System.out.println(numero1 * numero2);
        System.out.println(numero1 / numero2);

        // A variável char serve para armazenar um único caracter. Podendo ser qualquer um dentro da tabela
        // ascii. Pode-se também ao invés de colocar um número que existe dentro da tabela. Colocar um
        // valor que signifique algo dentro da tabela.

        char letra = 'a';
        char tabelasci = 66;
        System.out.println(letra);
        System.out.println(tabelasci);

        // A variável String é capaz de armazenar palavras inteiras e até mesmo textos dentro dela. Pode-se
        // também simplesmente criar ela para armazenar nada dentro.

        String texto = "Um textinho bem simples ou complicado.";
        System.out.println(texto);


    }
}