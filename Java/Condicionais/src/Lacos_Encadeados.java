public class Lacos_Encadeados {
    public static void main(String[] args){
        for(int multiplicador = 1; multiplicador <= 10; multiplicador++){
            // Um laço pode ter um laço dentro dele. Isso é um encadeamento.
            for(int contador = 0;contador <= 10; contador++){
                // O ln em println serve para pular uma linha após o fim de uma execução. Ou seja, o print sem ln ira
                // exibir uma informação sem pular linha.
                System.out.print(multiplicador * contador);
                System.out.print(" ");
                // O que aconteceu? O laço maior (multiplicador) entrou no menor (contador), realizando o menor até ele dar
                // false. Quando isso aconteceu, o laço menor acabou e voltou ao laço maior. E novamente ele entrou no menor
                // contendo um novo número. Por conta do escopo, o menor resetou ao ter este novo ciclo do maior entrando
                // dentro dele. Dai apenas quando o laço maior se satisfez e se tornou false, que ele parou de entrar dentro
                // do menor e ambos os loops pararam. Já que o menor só realiza ações caso o maior entre nele para realizar
                // alguma função.

            }
            // Isso está apenas aqui para deixar a exibição mais bonita.
            System.out.println();
        }

    }
}
