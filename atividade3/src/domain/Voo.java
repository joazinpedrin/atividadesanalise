package domain;

import java.util.ArrayList;
import java.util.List;

public class Voo {
     private String prefixo;
    private Aeroporto origem;
    private Aeroporto destino;
    private String dataPartida;
    private String dataChegada;
    private String nomeAeronave;
    private int limitePassageiros;
    private List<Passagem> passagens = new ArrayList<>();

    public Voo(String prefixo, Aeroporto origem, Aeroporto destino, String dataPartida, String dataChegada, String nomeAeronave, int limitePassageiros) {
        this.prefixo = prefixo;
        this.origem = origem;
        this.destino = destino;
        this.dataPartida = dataPartida;
        this.dataChegada = dataChegada;
        this.nomeAeronave = nomeAeronave;
        this.limitePassageiros = limitePassageiros;
    }

    public void adicionarPassagem(Passagem passagem) {
        passagens.add(passagem);
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public void setOrigem(Aeroporto origem) {
        this.origem = origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public void setDestino(Aeroporto destino) {
        this.destino = destino;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

    public String getNomeAeronave() {
        return nomeAeronave;
    }

    public void setNomeAeronave(String nomeAeronave) {
        this.nomeAeronave = nomeAeronave;
    }

    public int getLimitePassageiros() {
        return limitePassageiros;
    }

    public void setLimitePassageiros(int limitePassageiros) {
        this.limitePassageiros = limitePassageiros;
    }

    public List<Passagem> getPassagens() {
        return passagens;
    }

    public void setPassagens(List<Passagem> passagens) {
        this.passagens = passagens;
    }


}
