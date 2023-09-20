package domain;

public class Escala {
    private Voo voo;
    private String dataSaida;
    private String dataChegada;
    private String poltrona;

    public Escala(Voo voo, String dataSaida, String dataChegada, String poltrona) {
        this.voo = voo;
        this.dataSaida = dataSaida;
        this.dataChegada = dataChegada;
        this.poltrona = poltrona;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

    public String getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }


}
