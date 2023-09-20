package domain;

public class Vara {
    private int idVara;
    private String nome;
    private Tribunal tribunalAssociado;

    public Vara(int idVara, String nome, Tribunal tribunalAssociado) {
        this.idVara = idVara;
        this.nome = nome;
        this.tribunalAssociado = tribunalAssociado;
    }

    public int getIdVara() {
        return idVara;
    }

    public void setIdVara(int idVara) {
        this.idVara = idVara;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tribunal getTribunalAssociado() {
        return tribunalAssociado;
    }

    public void setTribunalAssociado(Tribunal tribunalAssociado) {
        this.tribunalAssociado = tribunalAssociado;
    }


}