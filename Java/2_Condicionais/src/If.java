public class If {
    public static void main(String[] args) {
        //Condicionais são códigos que testam algo para que ela funcione em determinada
        // condição.

        int idade1 = 24;
        int idade2 = 16;
        int quantidadePessoas = 4;

        // A função de uma condicional if é testar se algo é verdadeiro ou falso com base em
        // uma determinada comparação.
        if(idade1 >= 18) {
            // A condição testada dará este resultado caso seja True ou seja verdadeira.
            System.out.println("Você tem mais de 18 anos. Pode entrar.");

            // Porém a linha anterior não será executada caso o código seja False ou falso.
            // Para combater algum possível problema vindo disso existe o else. Que executa uma
            // ação quando o resultado da comparação é false.

        }else {
            System.out.println("Você tem menos de 18 anos. Va pra casa.");
        }

        // Quando um if tem uma instrução e não é necessária a utilização de else. Pode-se criar um laço
        // if sem chaves e sem else. Porém se isso acontecer, o código irá executar uma única linha de código

        if(idade1 >= 18)
            System.out.println("Maior de idade.");


        if(idade2 >= 18){
            System.out.println("Você tem mais de 18 anos. Pode entrar.");
        } else {
            // Caso haja mais de uma situação que queira ser verificada. Pode-se colocar um if dentro de
            // um else.
            if(quantidadePessoas >= 4){
                System.out.println("Pode entrar. Você é menor, mas como esta acompanhado ta tudo bem.");
            } else {
                System.out.println("Lamento, menor e sem acompnhantes o suficiente. Não pode entrar.");
            }
        }
    }
}