import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Conhecer e importar a classe Scanner
        //Exibir as mensagens para o usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem da conta criada


        // criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // número da agência bancária
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();
        // número da conta bancária
        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        // nome do cliente
        System.out.println("Por favor, digite o seu nome:");
        String NomeCliente = scanner.next();
        // saldo da conta
        System.out.println("Por favor, digite o valor do seu primeiro depósito:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + NomeCliente + ". Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");

    }
}
