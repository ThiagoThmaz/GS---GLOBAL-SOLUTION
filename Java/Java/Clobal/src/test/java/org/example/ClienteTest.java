package org.example;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    public void testValidarCPF() {
        assertTrue(Cliente.validarCPF("123.456.789-01"));
        assertFalse(Cliente.validarCPF("123.456.789-0"));
        assertFalse(Cliente.validarCPF("123.456.789-"));
        assertFalse(Cliente.validarCPF("12345678901"));
        assertTrue(Cliente.validarCPF("123.456.789-02"));
    }

    @Test
    public void testValidarEmail() {
        assertTrue(Cliente.validarEmail("usuario@example.com"));
        assertFalse(Cliente.validarEmail("usuario.example.com"));
        assertFalse(Cliente.validarEmail("usuario@example")); //
        assertFalse(Cliente.validarEmail("usuario@example.com."));
    }

    @Test
    public void testValidarTelefone() {
        assertFalse(Cliente.validarTelefone("(99) 99999-9999"));
        assertFalse(Cliente.validarTelefone("99 99999-9999"));
        assertFalse(Cliente.validarTelefone("(99) 999999999"));
        assertFalse(Cliente.validarTelefone("(99) 99999-999"));
        assertFalse(Cliente.validarTelefone("99 9999-9999"));
    }

    @Test
    public void testValidarDataNascimento() {
        assertTrue(Cliente.validarDataNascimento("01/01/1990"));
        assertFalse(Cliente.validarDataNascimento("01-01-1990"));
        assertFalse(Cliente.validarDataNascimento("1990/01/01"));
        assertTrue(Cliente.validarDataNascimento("30/02/1990"));
    }
}