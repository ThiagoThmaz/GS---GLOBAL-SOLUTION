package org.example;
import java.util.Date;

public class Barcacao implements Leitor {

    private String modeloBarco;
    private Date anoFabricacao;

    public Barcacao(String modeloBarco, Date anoFabricacao) {
        validarBarcacao(modeloBarco, anoFabricacao);
        this.modeloBarco = modeloBarco;
        this.anoFabricacao = anoFabricacao;
    }

    private void validarBarcacao(String modeloBarco, Date anoFabricacao) {
        if (modeloBarco == null || modeloBarco.isBlank()) {
            throw new IllegalArgumentException("Modelo da Barca é inválido");
        }
        if (anoFabricacao == null || anoFabricacao.after(new Date())) {
            throw new IllegalArgumentException("Ano de fabricação é inválido");
        }
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getModeloBarco() {
        return modeloBarco;
    }

    @Override
    public void dataHoraRegistro() {

    }
}
