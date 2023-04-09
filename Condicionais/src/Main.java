public class Main {
    public static void main(String[] args) {
        //Condiçcionais são códigos que testam algo para que ela cuncione em determinada
        // condição.
        int idade1 = 24;
        int idade2 = 16;
        int quantidadePessoas = 4;

        // A função de uma condicional if é testar se algo é verdadeiro ou falso com base em
        // uma determinada comparação.
        if(idade1 >= 18) {
            // A condição testada dara este resultado caso seja Tru ou seja verdadeira.
            System.out.println("Você tem mais de 18 anos. Pode entrar.");

            // Porem a linha anterior não sera executada caso o código seja False ou falso.
            // Para combater algum possivel problema vindo disso existe o else. Que executa uma
            // ação quando o resutado da comparação é false.
        }else {
            System.out.println("Você tem menos de 18 anos. Va pra casa.");
        }

        // Quando um if tem uma instrução e não é necessaria a utilização de else. Pode-se criar um laço
        // if sem chaves e sem else. Porém se isso acontecer, o código ira executar uma unica linha de código.
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