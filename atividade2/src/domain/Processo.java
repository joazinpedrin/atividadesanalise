package domain;
import java.util.ArrayList;
import java.util.List;

public class Processo {
    private String numeroProcesso;
    private Tribunal tribunal;
    private Vara vara;
    private String dataAbertura;
    private String dataConclusao;
    private Pessoa cliente;
    private Pessoa parteContraria;
    private List<Audiencia> audiencias = new ArrayList<>();
    private List<Custo> custos = new ArrayList<>();

    public Processo(String numeroProcesso, Tribunal tribunal, Vara vara, String dataAbertura, String dataConclusao, Pessoa cliente, Pessoa parteContraria) {
        this.numeroProcesso = numeroProcesso;
        this.tribunal = tribunal;
        this.vara = vara;
        this.dataAbertura = dataAbertura;
        this.dataConclusao = dataConclusao;
        this.cliente = cliente;
        this.parteContraria = parteContraria;
    }

    public void adicionarAudiencia(Audiencia audiencia) {
        audiencias.add(audiencia);
    }

    public void adicionarCusto(Custo custo) {
        custos.add(custo);
    }

    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public Tribunal getTribunal() {
        return tribunal;
    }

    public void setTribunal(Tribunal tribunal) {
        this.tribunal = tribunal;
    }

    public Vara getVara() {
        return vara;
    }

    public void setVara(Vara vara) {
        this.vara = vara;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(String dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Pessoa getParteContraria() {
        return parteContraria;
    }

    public void setParteContraria(Pessoa parteContraria) {
        this.parteContraria = parteContraria;
    }

    public List<Audiencia> getAudiencias() {
        return audiencias;
    }

    public void setAudiencias(List<Audiencia> audiencias) {
        this.audiencias = audiencias;
    }

    public List<Custo> getCustos() {
        return custos;
    }

    public void setCustos(List<Custo> custos) {
        this.custos = custos;
    }



}