package domain;

public class Exame {
    private int idExame;
    private String data;
    private String tipo;
    private String resultado;
    private Consulta consulta;

    public Exame(int idExame, String data, String tipo, String resultado, Consulta consulta) {
        this.idExame = idExame;
        this.data = data;
        this.tipo = tipo;
        this.resultado = resultado;
        this.consulta = consulta;
    }

    public int getIdExame() {
        return idExame;
    }

    public void setIdExame(int idExame) {
        this.idExame = idExame;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }


}