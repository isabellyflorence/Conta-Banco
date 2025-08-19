import java.util.Scanner;;

public class ContaTerminal {
    public static void main(String[] args){

    //Criando o objeto Scanner para capturar a entrada do usuário
    Scanner scanner = new Scanner(System.in);

    //Solicitando e armazenando os dados
    System.out.println("Por favor, digite o número da Agência:");
    int numero = scanner.nextInt();

    scanner.nextLine(); // Quebra de linha

    System.out.println("Por favor, digite a Agência:");
    String agencia = scanner.nextLine();

    System.out.println("Por favor, digite o Nome do Cliente:");
    String nomeCliente = scanner.nextLine();

    System.out.println("Por favor, digite o Saldo:");
    double saldo = scanner.nextDouble();

    String mensagem = "Olá" + nomeCliente + ", obrigado por criar uma conta em nosso banco, " + "sua agência é " + agencia + 
                      " e o número da sua conta é " + numero + ". Seu saldo é de R$" + saldo + " já está disponível para saque.";
    
    System.out.println(mensagem);

    // Fechando o scanner
    scanner.close();

    }
}
