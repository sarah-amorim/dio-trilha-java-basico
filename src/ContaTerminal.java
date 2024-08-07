import Entities.Clientes;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Clientes cliente = new Clientes();
        //sc.next();

        System.out.println("Digite seu nome: ");
        cliente.nome = sc.nextLine();

        System.out.println("Por favor, digite o numero da Agencia: ");
        cliente.agencia = sc.next();

        System.out.println("Digite o numero da conta: ");
        cliente.numero = sc.nextInt();

        System.out.println("Digite o saldo");
        cliente.saldo = sc.nextDouble();

        System.out.println(cliente);
        sc.close();
    }
}