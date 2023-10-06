import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prezado cliente digite o limite do seu cartão:");
        Double limite = scanner.nextDouble();
        Cartao cartaoteste = new Cartao(limite);

        int interruptor = 1;
        while (interruptor == 1) {
            System.out.print("Digite o valor da compra: ");
            Double valor = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("Defina a descrição da sua compra: ");
            String descricao = scanner.nextLine();
            
    
            Compra compra = new Compra(valor, descricao);

            compra.realizarCompra(cartaoteste);
            System.out.print("Digite 0 para sair ou 1 para continuar: ");
            interruptor = scanner.nextInt();
        }

        scanner.close();
    }
}
