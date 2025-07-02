import java.util.Scanner;

public class ContaTerminal {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Alocando as informações individualmente
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        String numeroConta = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Construindo a mensagem final com +
        String mensagem = "Olá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
            ", conta " + numeroConta + 
            " e seu saldo " + saldo + 
            " já está disponível para saque.";

        // Mostrando a mensagem
        System.out.println("\n" + mensagem);

        scanner.close();
    }

