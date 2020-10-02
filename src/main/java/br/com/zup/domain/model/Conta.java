package br.com.zup.domain.model;
import java.lang.String;
import java.util.Objects;

public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private String titular;

    public Conta() {

        super();
    }

    public Conta(double saldo, int agencia, int numero, String titular) {
        super();
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public boolean saca(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
        public boolean deposita(double valor) {
            this.saldo += valor;
            return true;

        }

        public boolean transfere(Conta contaDestino,double valor){
            boolean retirou = saca(valor);
            if (retirou) {
                contaDestino.deposita(valor);

                return true;

            }
            else{
                return false;
            }
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Double.compare(conta.saldo, saldo) == 0 &&
                agencia == conta.agencia &&
                numero == conta.numero &&
                Objects.equals(titular, conta.titular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saldo, agencia, numero, titular);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo + "\n" +
                ", agencia=" + agencia + "\n" +
                ", numero=" + numero + "\n" +
                ", titular='" + titular + "\n" +
                '}';
    }
}




