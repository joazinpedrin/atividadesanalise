package domain;

public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(int idPessoa, String nome, String email, String cnpj) {
        super(idPessoa, nome, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
