package domain;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
        private String nome;
    private String cpf;
    private String email;
    private List<Passagem> passagensCompradas = new ArrayList<>();

    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public void comprarPassagem(Passagem passagem) {
        passagensCompradas.add(passagem);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Passagem> getPassagensCompradas() {
        return passagensCompradas;
    }

    public void setPassagensCompradas(List<Passagem> passagensCompradas) {
        this.passagensCompradas = passagensCompradas;
    }


}