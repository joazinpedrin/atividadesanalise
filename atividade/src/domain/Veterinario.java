package domain;

public class Veterinario {
    private int idVeterinario;
    private String nome;
    private String CRMV;

    public Veterinario(int idVeterinario, String nome, String CRMV) {
        this.idVeterinario = idVeterinario;
        this.nome = nome;
        this.CRMV = CRMV;
    }

    public int getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCRMV() {
        return CRMV;
    }

    public void setCRMV(String cRMV) {
        CRMV = cRMV;
    }


}