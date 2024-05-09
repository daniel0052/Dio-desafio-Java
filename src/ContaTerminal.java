import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Número: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Nome do cliente: ");
        String nomeDoCliente = scanner.next();
        
        System.out.println("Sobrenome: ");
        String sobreNomeDoCliente = scanner.next();

        System.out.println("Saldo: "); 
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nomeDoCliente + " " + sobreNomeDoCliente + "\n Obrigado por criar um conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
