import domain.Audiencia;
import domain.Custo;
import domain.PessoaFisica;
import domain.PessoaJuridica;
import domain.Processo;
import domain.Tribunal;
import domain.Vara;

public class App {
    public static void main  (String[] args) throws Exception {
        Tribunal tribunalTRF1 = new Tribunal(1, "TRF-1");
        Vara varaCivel = new Vara(1, "Vara Cível", tribunalTRF1);

        PessoaFisica clienteCarlos = new PessoaFisica(1, "Carlos", "carloseduardodantas@iftm.edu.br", "000.000.000-00");
        PessoaJuridica parteContraria = new PessoaJuridica(2, "Starfield Linhas Espaciais", "starfield@gmail.com", "0001.0001.0001-00");

        Processo processo = new Processo("00345676-79.2014.4.01.3103", tribunalTRF1, varaCivel, "06/09/2023", "", clienteCarlos, parteContraria);

        Audiencia audiencia = new Audiencia("15/09/2023", "O advogado da parte contrária recomendou que o juiz arquive as acusações com base nas evidências apresentadas e na alegação de legítima defesa.");
        processo.adicionarAudiencia(audiencia);

        Custo custo = new Custo("15/09/2023", "Deslocamento até a cidade da audiência", 500.0);
        processo.adicionarCusto(custo);
    }
}