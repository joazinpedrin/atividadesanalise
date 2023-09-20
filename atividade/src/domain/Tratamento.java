package domain;
import java.util.ArrayList;
import java.util.List;

public class Tratamento {
    private int idTratamento;
    private String descricao;
    private Animal animal;
    private List<Consulta> consultas = new ArrayList<>();

    public Tratamento(int idTratamento, String descricao, Animal animal) {
        this.idTratamento = idTratamento;
        this.descricao = descricao;
        this.animal = animal;
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public int getIdTratamento() {
        return idTratamento;
    }

    public void setIdTratamento(int idTratamento) {
        this.idTratamento = idTratamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }


}
