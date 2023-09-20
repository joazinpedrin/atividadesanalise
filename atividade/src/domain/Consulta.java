package domain;
import java.util.ArrayList;
import java.util.List;

public class Consulta {
    private int idConsulta;
    private String data;
    private Veterinario veterinario;
    private String resumo;
    private List<Exame> exames = new ArrayList<>();

    public Consulta(int idConsulta, String data, Veterinario veterinario, String resumo) {
        this.idConsulta = idConsulta;
        this.data = data;
        this.veterinario = veterinario;
        this.resumo = resumo;
    }

    public void adicionarExame(Exame exame) {
        exames.add(exame);
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }


}
