package br.edu.univas.imobiliaria.userInputHandler;

import java.util.Scanner;

import br.edu.univas.imobiliaria.Corretor;

public class UserInputHandlerCorretor {
    public static Corretor userInputHandlerCorretor(Scanner scanner, int type, int _cod){
        while(true){
            try{
            	if (type == 1) {
                    // Atualização
                    System.out.println("Código atual: " + _cod);
                } else {
                	System.out.println("Digite o código do Corretor: ");
                    _cod = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                }

                System.out.println("Digite o CPF do Corretor: ");
                String cpf = scanner.nextLine();

                System.out.println("Digite o Nome do Corretor: ");  
                String nome = scanner.nextLine();

                System.out.println("Digite o Telefone do Corretor: ");
                Long telefone = scanner.nextLong();

                scanner.nextLine();


                return new Corretor(_cod, cpf, nome, telefone);
            }
            catch (Exception e){
                System.out.println("Erro de input" + e.getMessage());
                scanner.nextLine();
                continue;
            }
        }
    }    
}