package domain;

public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(int idPessoa, String nome, String email, String cpf) {
        super(idPessoa, nome, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}