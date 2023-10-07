public class CompraItem implements Comparable<CompraItem> {
    private Double valor;
    private String descricao;

    public CompraItem(Double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public void realizarCompra(CartaoDeCredito cartao) {
        if (this.valor <= cartao.getSaldoAtual()) {
            cartao.setSaldoAtual(cartao.getSaldoAtual() - this.valor);
            cartao.addExtrato(this.valor, this.descricao);
        } else {
            System.out.println("Saldo insuficiente, por favor coloque um valor válido.");
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

    @Override
    public String toString() {
        return "Descrição: " + descricao +
                "\nValor: R$ " + valor;
    }

    @Override
    public int compareTo(CompraItem outraCompra) {
        return Double.compare(this.valor, outraCompra.valor);
    }
}

