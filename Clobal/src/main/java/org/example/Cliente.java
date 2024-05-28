package org.example;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Cliente extends Barcacao{

    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private Date DataNasc;

    public Cliente(String modeloBarco, Date anoFabricacao, String nome, String cpf, String email, String telefone, Date dataNasc) {
        super(modeloBarco, anoFabricacao);
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        DataNasc = dataNasc;
    }

    // Validar CPF
    public static boolean validarCPF(String cpf) {
        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        return Pattern.matches(regex, cpf);
    }

    // Validar Email
    public static boolean validarEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Pattern.matches(regex, email);
    }

    //Validar Telefone
    public static boolean validarTelefone(String telefone) {
        String regex = "^\\\\(\\\\d{2}\\\\)\\\\s\\\\d{5}-\\\\d{4}$";
        return Pattern.matches(regex, telefone);
    }

    //Validar data de nascimento
    public static boolean validarDataNascimento(String DataNasc) {
        SimpleDateFormat data = new SimpleDateFormat("dd/mm/yyyy");
        data.setLenient(false);
        try {
            // parsing da data
            Date date = data.parse(DataNasc);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static void main(String[] args){
        String cpf = "123.456.789-01";
        String email = "usuario@example.com";
        String telefone = "(99) 99999-9999";
        String DataNasc = "01/01/1990";

        if (validarCPF(cpf)){
            System.out.println("CPF válido");
        }else {
            System.out.println("CPF inválido");
        }

        if (validarEmail(email)){
            System.out.println("E-mail válido");
        }else {
            System.out.println("E-mail inválido");
        }

        if (validarTelefone(telefone)){
            System.out.println("Telefone válido");
        } else {
            System.out.println("Telefone inválido");
        }

        if (validarDataNascimento(DataNasc)) {
            System.out.println("Data de nascimento válida");
        } else {
            System.out.println("Data de nascimento inválida");
        }
    }




}
