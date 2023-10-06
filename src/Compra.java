public class Compra {
    private Double valor;
    private String descricao;

    public Compra(Double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }



    //tenho que colocar um array ao invés da string conteudo
    //Eu ia colocar um segundo parâmetro
    public String mostraCompras(String descricao) {
        String templateInicial = "\n**************************\nCOMPRAS REALIZADAS:\n\n";
        String conteudo = "" + "" + ""; 
        String templateFinal = "\n**************************";

        return templateInicial + conteudo + templateFinal;
    }

    
    public void realizarCompra(Cartao cartao) {
        if (this.valor <= cartao.getSaldoAtual()) {
            cartao.setSaldoAtual(cartao.getSaldoAtual() - this.valor);
            cartao.addExtrato(this.valor, this.descricao);
            cartao.exibeExtrato();

            //tenho que colocar um array ao invés da string conteudo
            //System.out.println(mostraCompras(this.descricao));
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

    public String toString() {
        return "Descrição: " + descricao +
                "\nValor: R$ " + valor;
    }

}
