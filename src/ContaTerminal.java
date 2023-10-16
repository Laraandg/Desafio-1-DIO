import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite a sua conta bancária!");
        int conta = scanner.nextInt();

        System.out.println("Digite também a sua agência");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite o seu saldo");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá " + nome + " " + sobrenome + ", ");
        System.out.printf("obrigado por criar uma conta em nosso banco, sua conta é " + conta + ", ");
        System.out.println("agência " + agencia + " e seu saldo " + saldo + " já está disponível para saque.");


    }
}
