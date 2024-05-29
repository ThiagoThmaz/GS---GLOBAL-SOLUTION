package org.example;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class BarcacaoTest {

    @Test
    void validar_ano_modelo_barcacao() {
        String modeloBarco = "Modelo válido";
        Date anoFabricacao = new Date(System.currentTimeMillis() - 100000); // Fabricado há 100000 milissegundos atrás
        Barcacao barcacao = new Barcacao(modeloBarco, anoFabricacao);
        assertEquals(modeloBarco, barcacao.getModeloBarco());
        assertEquals(anoFabricacao, barcacao.getAnoFabricacao());
    }


}