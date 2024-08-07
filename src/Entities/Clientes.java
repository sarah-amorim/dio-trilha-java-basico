package Entities;

public class Clientes {
    public String nome;
    public String agencia;
    public int numero;
    public double saldo;

    public String toString(){
        return ("Ola, %s. " +
                "Obrigado por criar uma conta em nosso banco! " +
                "Sua agencia e %s, conta %d e " +
                "seu saldo %s ja esta disponivel para saque.").formatted(nome, agencia, numero, saldo);
    }
}
