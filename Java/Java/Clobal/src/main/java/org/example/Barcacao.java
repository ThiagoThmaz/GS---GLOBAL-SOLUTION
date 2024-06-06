package org.example;

import java.util.Date;

/**
 * A classe {@code Barcacao} representa um barco com modelo e ano de fabricação.
 * Esta classe implementa a interface {@code Leitor}.
 *
 * @author Thiago Thomaz
 * @since 1.0
 */
public class Barcacao implements Leitor {

    private String modeloBarco;
    private Date anoFabricacao;

    /**
     * Construtor da classe {@code Barcacao}.
     *
     * @param modeloBarco   o modelo do barco
     * @param anoFabricacao o ano de fabricação do barco
     * @since 1.0
     */
    public Barcacao(String modeloBarco, Date anoFabricacao) {
        validarBarcacao(modeloBarco, anoFabricacao);
        this.modeloBarco = modeloBarco;
        this.anoFabricacao = anoFabricacao;
    }

    /**
     * Valida os parâmetros de um barco.
     *
     * @param modeloBarco   o modelo do barco
     * @param anoFabricacao o ano de fabricação do barco
     * @since 1.0
     */

    private void validarBarcacao(String modeloBarco, Date anoFabricacao) {
        if (modeloBarco == null || modeloBarco.isBlank()) {
            throw new IllegalArgumentException("Modelo da Barca é inválido");
        }
        if (anoFabricacao == null || anoFabricacao.after(new Date())) {
            throw new IllegalArgumentException("Ano de fabricação é inválido");
        }
    }

    /**
     * Retorna o ano de fabricação do barco.
     *
     * @return o ano de fabricação do barco
     * @since 1.0
     */
    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    /**
     * Retorna o modelo do barco.
     *
     * @return o modelo do barco
     * @since 1.0
     */
    public String getModeloBarco() {
        return modeloBarco;
    }

    /**
     * Método da interface {@code Leitor} que deve ser implementado.
     *
     * @since 1.0
     */
    @Override
    public void dataHoraRegistro() {
        // Implementação do método
    }

    /**
     * Define o modelo do barco.
     *
     * @param modeloBarco o novo modelo do barco
     * @since 1.0
     */
    public void setModeloBarco(String modeloBarco) {
        this.modeloBarco = modeloBarco;
    }

    /**
     * Define o ano de fabricação do barco.
     *
     * @param anoFabricacao o novo ano de fabricação do barco
     * @since 1.0
     */
    public void setAnoFabricacao(Date anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    // Método de sobrescrita toString()
    @Override
    public String toString() {
        return "Barcacao{" +
                "modeloBarco='" + modeloBarco + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
