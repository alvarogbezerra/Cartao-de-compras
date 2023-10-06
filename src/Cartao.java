import java.util.ArrayList;

public class Cartao {
    private Double limiteInicial;
    private Double saldoAtual;
    private ArrayList<Compra> extrato;

    public Cartao(Double limiteInicial) {
        this.limiteInicial = limiteInicial;
        this.saldoAtual = limiteInicial;
        this.extrato = new ArrayList<>();
    }
    

    public Double getLimiteInicial() {
        return limiteInicial;
    }

    public void setLimiteInicial(Double limiteInicial) {
        this.limiteInicial = limiteInicial;
    }

    public Double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(Double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }


    public void exibeExtrato(){
        System.out.println("\n**************************\nCOMPRAS REALIZADAS:\n\n");
        this.extrato.forEach(t -> System.out.println(t));
        System.out.println("\nSaldo atual: R$ " + getSaldoAtual() +"\n**************************");
    }

    void addExtrato (Double valor, String descricao) {
        Compra t = new Compra(valor, descricao);
        this.extrato.add(t);
    }
}
