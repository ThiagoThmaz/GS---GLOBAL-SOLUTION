package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 * A classe {@code Cliente} representa um cliente com informações pessoais,
 * incluindo nome, CPF, e-mail, telefone e data de nascimento.
 * Esta classe estende a classe {@code Barcacao}.
 * @since 1.0
 * @autor Thiago Thomaz
 */
public class Cliente extends Barcacao {

    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private Date dataNasc;

    /**
     * Construtor da classe {@code Cliente}.
     * @param modeloBarco o modelo do barco
     * @param anoFabricacao o ano de fabricação do barco
     * @param nome o nome do cliente
     * @param cpf o CPF do cliente
     * @param email o e-mail do cliente
     * @param telefone o telefone do cliente
     * @param dataNasc a data de nascimento do cliente
     * @since 1.0
     */
    public Cliente(String modeloBarco, Date anoFabricacao, String nome, String cpf, String email, String telefone, Date dataNasc) {
        super(modeloBarco, anoFabricacao);
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
    }

    // Métodos setters...

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    // Métodos de validação...

    public static boolean validarCPF(String cpf) {
        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        return Pattern.matches(regex, cpf);
    }

    public static boolean validarEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Pattern.matches(regex, email);
    }

    public static boolean validarTelefone(String telefone) {
        String regex = "^\\(\\d{2}\\) \\d{5}-\\d{4}$";
        return Pattern.matches(regex, telefone);
    }

    public static boolean validarDataNascimento(String dataNasc) {
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        data.setLenient(false);
        try {
            // parsing da data
            Date date = data.parse(dataNasc);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     * Método principal para testar a validação dos dados do cliente.
     * @param args argumentos da linha de comando
     * @since 1.0
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();
        if (validarCPF(cpf)) {
            System.out.println("CPF válido");
        } else {
            System.out.println("CPF inválido");
        }

        System.out.print("Digite o e-mail: ");
        String email = scanner.nextLine();
        if (validarEmail(email)) {
            System.out.println("E-mail válido");
        } else {
            System.out.println("E-mail inválido");
        }

        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();
        if (validarTelefone(telefone)) {
            System.out.println("Telefone válido");
        } else {
            System.out.println("Telefone inválido");
        }

        System.out.print("Digite a data de nascimento (dd/MM/yyyy): ");
        String dataNasc = scanner.nextLine();
        if (validarDataNascimento(dataNasc)) {
            System.out.println("Data de nascimento válida");
        } else {
            System.out.println("Data de nascimento inválida");
        }

        scanner.close();
    }

    /** exemplo de parametros
     * String cpf = "123.456.789-01";
     * String email = "usuario@example.com";
     * String telefone = "(99) 99999-9999";
     * String dataNasc = "01/01/1990";
     */
}

