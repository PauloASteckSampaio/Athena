public class Conta {

    // Dentro de uma classe, se definem atributos. Atributos são variáveis da classe que recebe um valor quando a classe
    // é utilizada de alguma maneira.
    // Quando uma classe é utilizada ela cria um objeto e as variáveis dentro deste objeto são os atributos.
    // Um atributo quando é criado tem um valor default, que pode ser definido em sua definição dentro da classe ou
    // receber algum tipo de valor nulo. Este podendo ser ou 0 ou Null.
    // Atributos em sua forma básica podem ser acessados e modificados facilmente fora da classe. Por isso se adiciona a
    // palavra chave private. Ele torna privado o atributo. Fazendo com que ninguém fora da classe possa acessar o
    // atributo sem um método para ajudar.
    private double saldo;
    private int numero;
    private int agencia;

    // Quando uma classe é criada ela pode ser utilizada como atributo para outra classe. Assim unindo a outra classe a
    // ela
    private Cliente titular;

    // Quando um objeto é criado, ele por padrão tem seus valores zerados ou tornados null. Mas a uma maneira de
    // manter informações armazenadas ao fim da utilização de uma classe. Utilizando a palavra chave static, informamos
    // ao código que determinado atributo não pertence ao objeto, mas sim a classe.
    // O atributo ainda pode resetar e zerado ou anulado, pois ainda sim suas informações estão na memória e não no
    // banco. Porém, para a informação sumir, o código precisa ser reiniciado ou o programa fechado.
    private static int total;

    // Quando uma classe é criada, ela ganha algo chamado construtor. Ele é que dá definições de como o objeto é ou
    // deve ser criado. Apesar de podermos utilizar o construtor padrão, pode-se também criar o próprio construtor.
    // Isso serve para definir certas coisas que acontecem quando um objeto é criado e até mesmo criar pré-requisitos
    // para que ele possa ser criado.
    public Conta(int numero, int agencia){
        total++;
        System.out.println("Estou criando uma conta " + this.numero);
    }

    // Métodos são uma forma de se definir um comportamento em relação a um atributo. Ao criar um método existem algumas
    // coisas a serem levadas em consideração. Por exemplo, se o método não retorna nada, apenas executa uma ação. Este
    // recebe void ao definir o seu tipo. Caso contrário, se define o tipo de variável que aquilo é. Por exemplo, ela
    // pode ser uma boolean ou como no exemplo abaixo, um double.
    // Em Java utilizamos os chamados getters and setters. Eles ajudam a escrever os métodos responsáveis por ler our
    // escrever algo em determinado atributo. Os sufixos get e set não são sintaxes da linguagem Java. Eles são apenas
    // convenções de nomes que auxiliam em sua identificação. Se for dado um nome aleatório a um getter ou a um setter
    // não irá dar erro.
    public double getSaldo() {
        return saldo;
    }

    // O termo this é importante. Pois ele garante que o método executado está pegando o valor certo. Pois quando
    // o código fica complexo pode ocorrer algum "erro" e pegar um número errado. O this garante que o número usado é
    // realmente de quem chamou o método naquela hora.
    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
        }else{
        System.out.println("Saldo insuficiente");
        }
        return false;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }
}