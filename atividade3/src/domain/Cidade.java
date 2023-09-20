package domain;

public class Cidade {
    private int codigo;
    private String nome;
    private double populacao;

    public Cidade(int codigo, String nome, double populacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.populacao = populacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }


}