public class Main {
    public static void main(String[] args) {
        // A Variavel int representa o tipo numeros inteiros. Dentro dela se colocam
        // numeros que não possuam ponto flutuamte(virgula).
        int idade = 24;
        System.out.println(idade);

        // O double representa uma variavel de numero com ponto flutuante. Nela se colocam
        // numeros que possuem virgula. Caso seja colocado um numero inteiro dentro desta
        // variavel, o numero ira receber automaticamente uma virgula.
        double numero1 = 3.21;
        double numero2 = 8;
        System.out.println(numero1);
        System.out.println(numero2);

        // Utilizando-se de variaveis é possivel de se realizar opreções aritiméticas.
        // + realiza somas e concatenações. Uma concatenação é quando ao inves de se somar algo,
        // duas coisas se juntam. Como duas frases out até mesmo 2 numeros podendo ser exibidos
        // lado a lado.
        // - realiza operações de subtração.
        // * o asterico realiza operações de multiplicação
        // / a barra realiza operações de divisão
        System.out.println(numero1 + numero2);
        System.out.println(numero1 - numero2);
        System.out.println(numero1 * numero2);
        System.out.println(numero1 / numero2);

        // A Variavel char serve para armazenar um unico caracter. Podendo ser qualque um dentro da tabela
        // ascii. Pode-se também ao invés de colocar um numero que existe dentro da tabela. Colocar um
        // valor que signifique algo dentro da tabela.
        char letra = 'a';
        char tabelasci = 66;
        System.out.println(letra);
        System.out.println(tabelasci);

        // A variavel String é capaz de armazenar palavras inteiras e até mesmo textos dentro dela. Pode-se
        // também simplesmente criar ela para armazenar nada dentro.
        String texto = "Um textinho bem simples ou complicado.";
        System.out.println(texto);


    }
}