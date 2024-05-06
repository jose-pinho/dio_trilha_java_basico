import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite sua conta bancaria");
        int contaBancaria = scanner.nextInt();
        System.out.println("Por favor, agora digite sua agencia (ex: 5445-8)");
        String agencia = scanner.next();
        System.out.println("Por favor, digite seu nome completo");
        String nome=scanner.next();
        System.out.println("Agora insira o valor a ser depositado");
        float saldo = scanner.nextFloat();

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +" sua conta é" + contaBancaria + " e seu saldo "+ saldo +" já está disponível para para saque.");



        
    }
}
