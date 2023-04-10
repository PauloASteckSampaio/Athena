public class Break {
    public static void main(String[] args){
        for(int linha = 0; linha < 10; linha++){
            for(int coluna = 0;coluna < 10; coluna++){
                // Dentro do encadeamento de laços é sim permitido o uso de diferentes tipos de laços.
                if(coluna > linha){
                    // O comando break serve para parar, obrigar a sair da parte do laço onde ele foi colocado.
                    // Funcionando tipo como se a condição tivesse se tornado false.

                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
