package domain;

public class Custo {
    private String dataCusto;
    private String descricao;
    private double valor;

    public Custo(String dataCusto, String descricao, double valor) {
        this.dataCusto = dataCusto;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDataCusto() {
        return dataCusto;
    }

    public void setDataCusto(String dataCusto) {
        this.dataCusto = dataCusto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


}
