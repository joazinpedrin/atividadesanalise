package domain;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int idCliente;
    private String nome;
    private String endereco;
    private String telefone;
    private List<Animal> animais = new ArrayList<>();

    public Cliente(int idCliente, String nome, String endereco, String telefone) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }


}