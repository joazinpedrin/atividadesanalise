package domain;

public class Tribunal {
    private int idTribunal;
    private String nome;

    public Tribunal(int idTribunal, String nome) {
        this.idTribunal = idTribunal;
        this.nome = nome;
    }

    public int getIdTribunal() {
        return idTribunal;
    }

    public void setIdTribunal(int idTribunal) {
        this.idTribunal = idTribunal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}