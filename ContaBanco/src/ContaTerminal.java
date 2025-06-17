import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroConta = 0;
        String numeroAgencia = "";
        String nomeCliente = "";
        double saldoConta = -1;

        System.out.println("===== Bem-vindo ao Banco Java! =====");

        while (true) {
            System.out.print("Digite o número da conta: ");
            if (scanner.hasNextInt()) {
                numeroConta = scanner.nextInt();
                if (numeroConta > 0) break;
                else System.out.println("⚠️ Número da conta deve ser maior que zero.");
            } else {
                System.out.println("⚠️ Entrada inválida! Digite um número inteiro.");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("Digite o número da agência (mínimo 4 caracteres): ");
            numeroAgencia = scanner.next();
            if (numeroAgencia.length() >= 4) break;
            else System.out.println("⚠️ Número da agência deve ter pelo menos 4 caracteres.");
        }

        scanner.nextLine(); 

        System.out.print("Digite o nome completo do cliente: ");
        nomeCliente = scanner.nextLine();

        while (true) {
            System.out.print("Digite o saldo da conta: ");
            if (scanner.hasNextDouble()) {
                saldoConta = scanner.nextDouble();
                if (saldoConta >= 0) break;
                else System.out.println("⚠️ O saldo não pode ser negativo.");
            } else {
                System.out.println("⚠️ Entrada inválida! Digite um valor numérico (ex: 2500.00)");
                scanner.next(); 
            }
        }

        System.out.println("\nOlá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + 
            ", conta " + numeroConta + " e seu saldo " + String.format("R$ %.2f", saldoConta) + 
            " já está disponível para saque.");

        scanner.close();
    }
}
