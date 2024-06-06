package org.example;

/**
 * A classe {@code Qualidade} representa um parâmetro de qualidade com valores mínimo e máximo.
 * Esta classe implementa a interface {@code Leitor}.
 *
 * @author Thiago Thomaz
 * @since 1.0
 */
public class Qualidade implements Leitor {

    protected String parametro;
    private double valorMinino;
    private double valorMaximo;

    /**
     * Construtor da classe {@code Qualidade}.
     *
     * @param parametro   o nome do parâmetro de qualidade
     * @param valorMinino o valor mínimo aceitável para o parâmetro
     * @param valorMaximo o valor máximo aceitável para o parâmetro
     * @since 1.0
     */
    public Qualidade(String parametro, double valorMinino, double valorMaximo) {
        this.parametro = parametro;
        this.valorMinino = valorMinino;
        this.valorMaximo = valorMaximo;
    }

    /**
     * Retorna o nome do parâmetro de qualidade.
     *
     * @return o nome do parâmetro de qualidade
     * @since 1.0
     */
    public String getParametro() {
        return parametro;
    }

    /**
     * Retorna o valor mínimo aceitável para o parâmetro.
     *
     * @return o valor mínimo aceitável para o parâmetro
     * @since 1.0
     */
    public double getValorMinino() {
        return valorMinino;
    }

    /**
     * Retorna o valor máximo aceitável para o parâmetro.
     *
     * @return o valor máximo aceitável para o parâmetro
     * @since 1.0
     */
    public double getValorMaximo() {
        return valorMaximo;
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
}
