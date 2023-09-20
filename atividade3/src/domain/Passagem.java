package domain;

import java.util.ArrayList;
import java.util.List;

public class Passagem {
        private String codigoReserva;
    private double valor;
    private Cliente cliente;
    private List<Escala> escalas = new ArrayList<>();

    public Passagem(String codigoReserva, double valor, Cliente cliente) {
        this.codigoReserva = codigoReserva;
        this.valor = valor;
        this.cliente = cliente;
    }

    public void adicionarEscala(Escala escala) {
        escalas.add(escala);
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Escala> getEscalas() {
        return escalas;
    }

    public void setEscalas(List<Escala> escalas) {
        this.escalas = escalas;
    }


}
