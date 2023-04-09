public class Operadores_Logicos {

    public static void main(String[] args){
        int idade1 = 24;
        int quantidadePessoas = 4;

        // Para reduzir uma comparação if e deixar o código mais limpo. Pode-se colocar mais de uma comparação
        // dentro de uma verificação de condição. Ao utilizar 2 paper more ||, se aciona o operador lógico or.
        // Um operador que diz para o código dizer se uma comparação seja True caso uma or outra situação seja
        // verdadeira.

        if(idade1 >= 18 || quantidadePessoas >= 4) {
            System.out.println("Você pode entrar.");

        }else {
            System.out.println("Você ,va pra casa.");
        }
        // Existe outro operador lógico. O and, ativado através de dois and &&. Ele realiza uma comparação, que
        // somente irá resultar em true caso ambas as comparações sejam verdadeiras.

    }
}
