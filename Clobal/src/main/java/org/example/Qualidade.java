package org.example;

public class Qualidade implements Leitor {

    protected String parametro;
    private double valorMinino;
    private double valorMaximo;

    public Qualidade(String parametro, double valorMinino, double valorMaximo) {
        this.parametro = parametro;
        this.valorMinino = valorMinino;
        this.valorMaximo = valorMaximo;
    }

    public String getParametro() {
        return parametro;
    }

    public double getValorMinino() {
        return valorMinino;
    }

    public double getValorMaximo() {
        return valorMaximo;
    }

    @Override
    public void dataHoraRegistro() {

    }
}
