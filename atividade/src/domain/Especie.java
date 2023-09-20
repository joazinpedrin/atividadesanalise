package domain;

public class Especie {
    private int idEspecie;
    private String nome;

    public Especie(int idEspecie, String nome) {
        this.idEspecie = idEspecie;
        this.nome = nome;
    }

    public int getIdEspecie() {
        return idEspecie;
    }

    public void setIdEspecie(int idEspecie) {
        this.idEspecie = idEspecie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}