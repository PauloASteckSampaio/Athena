public class TestaClasses {
    public static void main(String[] args) {

        // Quando se cria uma classe, podem-se criar os chamados objetos. Para se criar um objeto, se utiliza a palavra
        // chave new. Junto dela se coloca o nome da classe e na hora de definir o tipo da variável se utiliza como
        // tipo o nome da classe utilizada. A alguns momentos aonde o tipo de variável pode diferir do nome da classe,
        // mas isso vem mais para frente.
        Conta contaDoPaulo = new Conta(44, 8001);

        // Para chamar um método se utiliza o nome da variavel.nomeDoMetodo() .Em alguns casos quando se está utilizando
        // um atributo "nu", não é necessário o uso de parenteses. Mas quando falamos de um método ele é necessário
        // mesmo que ele não receba nenhum valor.
        contaDoPaulo.deposita(200);
        System.out.println(contaDoPaulo.getSaldo());
        contaDoPaulo.saca(100);
        System.out.println(contaDoPaulo.getSaldo());

        // Um objeto só é criado quando se dá um new. Quando se atribui o nome de um objeto para uma variável, não se
        // cria um novo objeto. Isso porque a variável não é o objeto, ela apenas armazena o endereço de onde ele está
        // na memória. Isso que a variável armazena se chama, referência.
        Conta contaReferencia = contaDoPaulo;
        System.out.println(contaReferencia.getSaldo());

        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Antonio");
        contaDoPaulo.setTitular(paulo);

        // Como explicado anteriormente, ao definir uma classe como atributo, elas ficam interligadas. Ao chamar uma
        // função referente a classe que a usa, a classe utilizada responde.
        // É possível de se juntar mais de um método e chamá-lo/utilizá-los ao mesmo tempo.
        System.out.println(contaDoPaulo.getTitular().getNome());

        Conta contaExemploStatic = new Conta(2, 2);
        Conta contaExemploStatic2 = new Conta(3, 3);

        // Como o método é da classe e não do objeto, para chamá-lo se utiliza-se o nome da classe e não de um dos
        // objetos.
        System.out.println(Conta.getTotal());
        // Não vai dar erro se utilizar o nome de uma variável de objeto. Porém debate velmente utilizar a classe é
        // uma opção melhor.
        System.out.println(contaDoPaulo.getTotal());

    }
}
