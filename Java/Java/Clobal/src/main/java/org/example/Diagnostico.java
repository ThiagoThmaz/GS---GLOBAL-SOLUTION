package org.example;

/**
 * A classe {@code Diagnostico} representa um diagnóstico com resultado e status.
 * Esta classe implementa a interface {@code Leitor}.
 * @since 1.0
 * @author Thiago Thomaz
 */
public class Diagnostico implements Leitor {

    private String resultado;
    private String status;

    /**
     * Construtor da classe {@code Diagnostico}.
     * @param resultado o resultado do diagnóstico
     * @param status o status do diagnóstico
     * @since 1.0
     */
    public Diagnostico(String resultado, String status) {
        this.resultado = resultado;
        this.status = status;
    }

    /**
     * Retorna o resultado do diagnóstico.
     * @return o resultado do diagnóstico
     * @since 1.0
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Retorna o status do diagnóstico.
     * @return o status do diagnóstico
     * @since 1.0
     */
    public String getStatus() {
        return status;
    }

    /**
     * Método da interface {@code Leitor} que deve ser implementado.
     * @since 1.0
     */
    @Override
    public void dataHoraRegistro() {
        // Implementação do método
    }
}
