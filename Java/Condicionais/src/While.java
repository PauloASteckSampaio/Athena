public class While {
    public static void main(String[] args){
        int contador = 0;
        // A condicional while realiza uma ação até que a comparação deixe de ser verdadeira.
        while(contador <= 10){
            System.out.println(contador);
            // Dentro de um loop pode-se realizar qualquer tipo de operação. Como por exemplo, criar um
            // modificador dentro do contador.
            contador = contador + 1;
            // Uma maneira mais simples e debativelmente elegante de se realizar a operação anteriormente
            // realizada é utilizar ++. Uma função simples que remove a necessidade de uma redundancia como
            // escrever o nome de uma variavel 2 vezes sem necessidade.
        }

        // Uma modificação feita dentro de um laço ira valer fora dele também.
        System.out.println(contador);
        // Porem ao executar este código nota-se um "erro". Isso ocorre por conta do bloco de código que existe
        // dentro do while. Pois como o ultimo valor passou pelo loop, ele ainda recebeu a adição no contador.
        // Como o numero novo não cumpre com a condição ele apenas não foi exibido e parou o loop. Mas ainda sim
        // foi-se adicionado + 1 a ele.

    }

}
