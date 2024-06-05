package org.example;

import java.util.Scanner;

import static org.example.Cliente.*;
import static org.example.Cliente.validarDataNascimento;

/**
 * A classe {@code Main} representa a Classe principal para testar valores.
 * Esta classe implementa os Teste da Classe {@code Cliente}.
 * @since 1.0
 * @author Thiago Thomaz
 */

public class Main {

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
