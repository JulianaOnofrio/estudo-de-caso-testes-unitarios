package br.com.zup.domain.model;

public class ContaBuilder {

    private Conta conta;
    private static ContaBuilder uniqueInstance = new ContaBuilder();

    public ContaBuilder() { super();}

    public static ContaBuilder getInstance() { return uniqueInstance; }

    public ContaBuilder conta(double saldo, int agencia,int numero, String titular) {

        this.conta = new Conta(saldo,agencia,numero,titular);
        return this;

    }

    public Conta build(){ return this.conta;}

}
