import domain.Aeroporto;
import domain.Cidade;
import domain.Cliente;
import domain.Escala;
import domain.Passagem;
import domain.Voo;

public class App {
    public static void main(String[] args) throws Exception {
        Cidade cidadeRioDeJaneiro = new Cidade(1, "Rio de Janeiro", 6.748);
        Aeroporto aeroportoGaleao = new Aeroporto(1, "Galeão", "22° 48' 36\" S 43° 15' 02\" O", cidadeRioDeJaneiro);

        Voo voo1 = new Voo("G3 1331", aeroportoGaleao, aeroportoGaleao, "5/9", "5/9", "BOEING 737 MAX", 170);
        Voo voo2 = new Voo("G3 1496", aeroportoGaleao, aeroportoGaleao, "10/9", "10/9", "BOEING 737 700", 140);

        Cliente clienteRonaldo = new Cliente("Ronaldo Fenômeno", "000.000.000-00", "ronaldofenomeno@gmail.com");

        Passagem passagem = new Passagem("HKGAUL", 585.56, clienteRonaldo);

        Escala escala1 = new Escala(voo1, "5/9 21:06", "5/9 22:24", "Poltrona 1A");
        Escala escala2 = new Escala(voo2, "10/9 23:30", "11/9 1:10", "Poltrona 2B");

        passagem.adicionarEscala(escala1);
        passagem.adicionarEscala(escala2);

        clienteRonaldo.comprarPassagem(passagem);
    }
}
