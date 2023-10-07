import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartaoDeCredito {
    private double limiteInicial;
    private double saldoAtual;
    private List<CompraItem> extrato;

    public CartaoDeCredito(double limiteInicial) {
        this.limiteInicial = limiteInicial;
        this.saldoAtual = limiteInicial;
        this.extrato = new ArrayList<>();
    }

    public double getLimiteInicial() {
        return limiteInicial;
    }

    public void setLimiteInicial(double limiteInicial) {
        this.limiteInicial = limiteInicial;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public void exibeExtrato() {
        Collections.sort(this.extrato, Collections.reverseOrder());
        System.out.println("\n**************************\nCOMPRAS REALIZADAS:\n\n");
        for (CompraItem compra : this.extrato) {
            System.out.println(compra);
        }
        System.out.println("\nSaldo atual: R$ " + getSaldoAtual() + "\n**************************");
    }

    public void addExtrato(double valor, String descricao) {
        CompraItem compra = new CompraItem(valor, descricao);
        this.extrato.add(compra);
    }
}

