
import java.util.InputMismatchException;
import java.util.Scanner;


public class ContaTerminal {
    // Atributos da conta bancária
    private int conta;
    private String agencia;
    private String nomeCliente;
    private double saldo;
    
    // Método para criar uma nova conta
    public void createAccount() {
        // Cria um objeto Scanner para ler dados do terminal
        Scanner sc = new Scanner(System.in);
        // Loop para garantir que o número da conta seja válido
        boolean isContaNumberInputCorrect = false;
        do {
            try {
                // Solicita ao usuário para inserir o número da conta
                System.out.println("Por favor digite o número da sua conta: ");
                this.conta = sc.nextInt();
                sc.nextLine(); // Limpa o buffer do Scanner após ler um int
                isContaNumberInputCorrect = true;
            } catch (InputMismatchException e) {
                // Trata exceções caso o usuário insira algo inválido
                System.out.println("Conta inválida, por favor digite apenas números.");
                sc.nextLine(); // Limpa o buffer do Scanner após uma exceção
            } 
        } while (!isContaNumberInputCorrect);
        // Solicita e armazena a agência
        System.out.println("Por favor digite sua agência: ");
        this.agencia = sc.nextLine();
        // Solicita e armazena o nome do cliente
        System.out.println("Por favor digite o nome do cliente: ");
        this.nomeCliente = sc.nextLine();
        // Loop para garantir que o saldo seja válido
        boolean isSaldoInputCorrect = false;
        do {
            try {
                // Solicita ao usuário para inserir o valor do saldo
                System.out.println("Por favor insira seu saldo: ");
                String balanceString = sc.nextLine().replace(",", ".");
                // Converte a string para double, removendo possíveis vírgulas
                this.saldo = Double.parseDouble(balanceString);
                isSaldoInputCorrect = true;
            } catch (NumberFormatException e) {
                // Trata exceções caso o valor digitado não seja um número decimal válido
                System.out.println("Saldo incorreto, insira somente valores decimais.");
            }
        } while (!isSaldoInputCorrect);
        // Imprime os dados da conta
    System.out.println("Olá " + this.nomeCliente + " obrigado por criar uma conta em nosso banco. Sua agência é " + this.agencia + ", conta " + this.conta + " e seus saldo R$ " + this.saldo + " já está disponível para saque.");
    }
}