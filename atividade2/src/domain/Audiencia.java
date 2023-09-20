package domain;

public class Audiencia {
    private String dataAudiencia;
    private String recomendacao;

    public Audiencia(String dataAudiencia, String recomendacao) {
        this.dataAudiencia = dataAudiencia;
        this.recomendacao = recomendacao;
    }

    public String getDataAudiencia() {
        return dataAudiencia;
    }

    public void setDataAudiencia(String dataAudiencia) {
        this.dataAudiencia = dataAudiencia;
    }

    public String getRecomendacao() {
        return recomendacao;
    }

    public void setRecomendacao(String recomendacao) {
        this.recomendacao = recomendacao;
    }

}