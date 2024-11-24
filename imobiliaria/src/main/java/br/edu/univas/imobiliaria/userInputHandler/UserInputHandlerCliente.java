package br.edu.univas.imobiliaria.userInputHandler;

import br.edu.univas.imobiliaria.*;
import br.edu.univas.imobiliaria.DbManager.*;
import java.util.*;

public class UserInputHandlerCliente {
    public static Cliente userInputHandlerCliente(Scanner scanner, int type, int cod) {    	
    	if (type == 1) {
            // Atualização
            System.out.println("Código atual: " + cod);
        } else {
            System.out.println("Código do Cliente:");
            cod = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer
        }

        System.out.println("Nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Número de telefone:");
        long numTelefone = scanner.nextLong();
        scanner.nextLine(); // Limpa o buffer

        System.out.println("Cliente é Pessoa Física (PF) ou Jurídica (PJ)?");
        String tipoCliente = scanner.nextLine().toUpperCase();

        String numCPF = "";
        String numCNPJ = "";

        // Se for PF, solicita CPF, senão, solicita CNPJ
        if (tipoCliente.equals("PF")) {
            System.out.println("CPF:");
            numCPF = scanner.nextLine();
        } else if (tipoCliente.equals("PJ")) {
            System.out.println("CNPJ:");
            numCNPJ = scanner.nextLine();
        } else {
            System.out.println("Tipo de cliente inválido! Use 'PF' ou 'PJ'.");
        }

        return new Cliente(cod, nomeCliente, numTelefone, tipoCliente, numCPF, numCNPJ);
    }
}