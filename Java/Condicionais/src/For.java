public class For {
    public static void main(String[] args){

        // O laço for é separado por um conjunto de 3 zonas. Cada um tendo a sua própria função.
        // A primeira zona pode ficar vazia. Sua função é a criação de uma variável que geralmente será um contador.
        // A segunda zona executa todas as vezes que o laço se repete. Ele sendo responsável por verificar a condição
        // do laço e definir se ela é true ou false.
        // E por fim a terceira zona define o que acontece no final de cada iteração do loop.

        for(int contador = 0;contador <= 10;contador ++) {
            System.out.println(contador);
        }
        // Porém o que é criado dentro de um laço for pertence ao laço for. Isso ocorre por conta de um conceito chamado
        // escopo. Cada par de chaves é uma espécie de zona. Zonas mais para fora dividem o que elas possuem com zonas
        // que estejam mais para dentro. Mas geralmente zonas mais internas não dividem informações com zonas mais
        // para fora. Neste exemplo, a variável contador criada dentro do laço for não existe e vai dar erro se for
        // utilizada fora do laço.
        //System.out.println(contador);
    }
}
