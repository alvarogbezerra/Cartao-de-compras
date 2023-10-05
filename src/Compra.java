import java.util.Scanner;

public class Compra {
    private Double valor;
    private String descricao;

    public Compra(Double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }
    Scanner scanner = new Scanner(System.in);

    
    public void realizaCompra(Cartao cartao, Compra compra) {
        if (valor <= cartao.getsaldoAtual()) {
            cartao.getsaldoAtual() -= valor;

            System.out.println("Defina a descrição da sua compra.");
            String descricao = scanner.nextLine();
            compra.setDescricao(descricao);
            
            System.out.println("Compra realizada.");
        } else {
            System.out.println("Saldo insuficiente, por favor coloque um valor válido. ");
        }
    }

    

    public Double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
