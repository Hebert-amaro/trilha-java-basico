import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        String numeroConta = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Construindo a mensagem com concat()
        String mensagem = "Olá ".concat(nomeCliente)
            .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
            .concat(agencia)
            .concat(", conta ")
            .concat(numeroConta)
            .concat(" e seu saldo ")
            .concat(String.valueOf(saldo))
            .concat(" já está disponível para saque.");

        System.out.println("\n" + mensagem);

        scanner.close();
    }
}

