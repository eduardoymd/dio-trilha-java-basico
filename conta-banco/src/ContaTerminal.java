import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //to-do: conhecer e importar a classe Scanner
        // exibir as mensagens para nosso usuário
        //obter pelo scanner os valores digitados no terminal
        // exibir mensagem conta criada
    
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, complete as informações a seguir para criar uma conta.");
        System.out.print("Numero da conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Saldo: ");
        saldo = scanner.nextDouble();
    
        System.out.println("\nNúmero da conta: " + numeroConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.printf("Saldo disponível: R$ %.2f\n", saldo);
        
        scanner.close();
    }
}
