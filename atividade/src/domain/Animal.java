package domain;
import java.util.ArrayList;
import java.util.List;

public class Animal {
    private int idAnimal;
    private String nome;
    private String sexo;
    private int idade;
    private Especie especie;
    private List<Tratamento> tratamentos = new ArrayList<>();

    public Animal(int idAnimal, String nome, String sexo, int idade, Especie especie) {
        this.idAnimal = idAnimal;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.especie = especie;
    }

    public void adicionarTratamento(Tratamento tratamento) {
        tratamentos.add(tratamento);
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public List<Tratamento> getTratamentos() {
        return tratamentos;
    }

    public void setTratamentos(List<Tratamento> tratamentos) {
        this.tratamentos = tratamentos;
    }

}