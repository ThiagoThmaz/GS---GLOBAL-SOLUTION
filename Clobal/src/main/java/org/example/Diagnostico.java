package org.example;

public class Diagnostico implements Leitor {

    private String resultado;

    private String status;

    public Diagnostico(String resultado, String status) {
        this.resultado = resultado;
        this.status = status;
    }

    public String getResultado() {
        return resultado;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void dataHoraRegistro() {

    }
}
