#LAB 2 – Herança, sobrescrita, métodos e classes abstratas

##Início
Esse lab está no Github (https://github.com/alexandrehst/ContaCorrente.git).
Cada commit contém a solução de um exercício. Tente fazer e consulte apenas para corrigir.

Vamos fazer um sistema simples de controle de conta corrente.

##Exercício 1
Crie as seguintes classes:
Banco:
	- Atributos nome e número
Agência:
	- Atributos banco e número
Cliente:
	- Atributo nome
Conta:
	- Atributos Cliente, Agência e saldo

Crie os métodos necessários nas classes, incluindo os construtores, de modo que a seguinte execução do controlador funcione:
```java
public class Controlador {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Joaquim José de Alcântara Xavier");
        Conta conta = new Conta(
                        new Agencia(
                                new Banco( 1, "Banco do Brasil"),
                                3030),
                        cliente);
        conta.depositar(1000);
        conta.sacar(300);
        
        System.out.println("O saldo da conta é R$ " + conta.getSaldo());
    }
}
``
`##Exercício 2
Vamos aumentar o modelo permitindo que ele tenha mais um tipo de conta:

Conta Corrente: são **Conta**, tem um atributo **limite** e aceitam saques até que o limite negativo seja atingido.

Pesquise o que é significa a annotation @Override e quando usá-la

A classe deverá ter um método construtor e um método **sacar** com a annotation **@Override**.

Garanta que o seguinte controlador funcione:

```java
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Joaquim José de Alcântara Xavier");
        Banco banco = new Banco( 1, "Banco do Brasil");
        Agencia agencia = new Agencia( banco, 3030);
        ContaCorrente conta = new ContaCorrente( agencia, cliente);

        conta.setLimite(100);
        conta.depositar(1000);
        conta.sacar(2000);
        
        // o saldo deverá ser 1000
        System.out.println("O saldo da conta é R$ " + conta.getSaldo());
        
        conta.sacar(1050);
        // o saldo deverá ser -50
        System.out.println("O saldo da conta é R$ " + conta.getSaldo());
    }
``##`

Exercício 3
Agora, vamos aumentar nosso sistema. Primeiro, vamos criar a seguinte classe:
```java
public class Movimentacao {
    private String historico;
    private double valor;
    
    public Movimentacao(String historico, double valor){
        this.historico = historico;
        this.valor = valor;
    }  
}
```

Na classe **Conta**, crie um **Arraylist** de **Movimentacao** chamado historico.

Inclua a seguinte linha no método depositar:
**historico.add( new Movimentacao( "Depósito", valor));**

e no método sacar:
**historico.add( new Movimentacao( "Saque", valor*-1));**

Ainda na classe **Conta**, crie um método **extrato** que navegue no Arraylist e mostre toda a movimentação da conta;

##Exercício 4
Vamos criar agora uma classe **ContaPoupanca** que é **Conta**. Essa classe não deverá permitir saques abaixo do saldo.

Pesquise o que é uma classe abstrata e entenda o conceito.

Pesquise o que é um método abstrato e entenda o conceito.

Nós não queremos mais que um objeto do tipo **Conta** possa ser criado. Como fazemos isso?

Na classe **ContaCorrente**, crie um método **atualizacaoMensal**. Esse método lança um débito equivalente a 14% do saldo negativo, se houver.

Na classe **ContaPoupanca**, crie um método **atualizacaoMensal**. Esse método lança um crédito equivalente a 0,6% do crédito, se houver.

Talvez você queira mudar a visibilidade do atributo saldo para **protected**. Pesquise o que é isso.

Nós queremos que qualquer classe que venha a ser criada, e que seja filha de **Conta**, tenha o método **atualizacaoMensal**. Como fazemos isso?

##Exercício 5
Por fim, vamos fazer com que a agência tenha um Arraylist de contas. 

No construtor da classe **Conta**, inclua a seguinte linha:
**this.agencia.getContas().add(this);**

A classe **Agencia** deverá ter um método chamado **atualizacao** que navega no Arraylist fazendo a atualização mensal das contas dos clientes.

Escreva um comentário no código explicando onde ocorre a chamada polimórfica.

