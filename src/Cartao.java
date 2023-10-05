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

    public Double getlimiteInicial() {
        return limiteInicial;
    }

    public void setlimiteInicial(Double limiteInicial) {
        this.limiteInicial = limiteInicial;
    }

    public Double getsaldoAtual() {
        return saldoAtual;
    }

    public void setsaldoAtual(Double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

}
