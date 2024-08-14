import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite o nome da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu saldo: ");
        float saldo = scanner.nextInt();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo +
        " já está disponível para saque.");
    }
}