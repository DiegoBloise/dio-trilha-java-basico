import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Integer numero;
        String agencia;
        String cliente;
        Float saldo;

        System.out.print("\nInforme o numero da conta...: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\nInforme o numero da agencia.: ");
        agencia = scanner.nextLine();

        System.out.print("\nInforme o nome do cliente...: ");
        cliente = scanner.nextLine();

        System.out.print("\nInforme o valor a ser depositado..: R$ ");
        saldo = scanner.nextFloat();

        scanner.close();

        System.out.printf(
                "\n\nOla %s, obrigado por criar uma conta em nosso banco, sua agencia e %s, conta %d e seu saldo R$ %.2f ja esta disponivel para saque.\n\n",
                cliente, agencia, numero, saldo);
    }
}
