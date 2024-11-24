package br.edu.univas.imobiliaria;

import java.util.Scanner;

import br.edu.univas.imobiliaria.userInputHandler.*;
import br.edu.univas.imobiliaria.DbManager.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu de Interação com o Usuário:");
            System.out.println("1 - CRUD Cliente ");
            System.out.println("2 - CRUD Contrato ");
            System.out.println("3 - CRUD Proprietário ");
            System.out.println("4 - CRUD Corretor ");
            System.out.println("5 - CRUD Imóvel ");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    menuCliente(scanner);
                    break;
                case 2:
                    menuContrato(scanner);
                    break;
                case 3:
                    menuProprietario(scanner);
                    break;
                case 4:
                    menuCorretor(scanner);
                    break;
                case 5:
                    menuImovel(scanner);
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
    
    private static void _printOptions() {
    	System.out.println("Qual ação deseja realizar: ");
        System.out.println("1 - Leitura");
        System.out.println("2 - Inserção");
        System.out.println("3 - Deletar");
        System.out.println("4 - Atualizar");
    }

    private static void menuCliente(Scanner scanner) {
        _printOptions();

        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        int cod = 0;

        switch (opcao) {
            case 1:
                System.out.print("Digite o código que deseja consultar: ");
                cod = scanner.nextInt();
                scanner.nextLine();
                
                DbManagerCliente.find(cod);
                
                break;
                
            case 2:
                Cliente cliente = UserInputHandlerCliente.userInputHandlerCliente(scanner, 0, 0);
                
                DbManagerCliente.persist(cliente);
                
                break;
            case 3:
                System.out.print("Digite o código que deseja deletar");
                cod = scanner.nextInt();
                scanner.nextLine();

                DbManagerCliente.remove(cod);
                
                break;
            case 4:
                System.out.print("Digite o código que deseja atualizar: ");
                cod = scanner.nextInt();
                scanner.nextLine();

                cliente = UserInputHandlerCliente.userInputHandlerCliente(scanner, 1, cod);
                
                DbManagerCliente.merge(cliente, cod);
                
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    private static void menuContrato(Scanner scanner) {
        _printOptions();

        int opcao = scanner.nextInt();
        scanner.nextLine();

        int cod = 0;

        switch(opcao){
            case 1:
                System.out.print("Digite o código que deseja consultar (Digite -1 caso queira consultar todos os registros do arquivo): ");
                cod = scanner.nextInt();
                scanner.nextLine();

                break;
            case 2:
                Contrato contrato = UserInputHandlerContrato.userInputHandlerContrato(scanner, 0, 0);
                break;
            case 3:
                System.out.print("Digite o código que deseja deletar (Digite -1 caso queria deletar todos os registros do arquivo): ");
                cod = scanner.nextInt();
                scanner.nextLine();

                break;
            case 4:
                System.out.print("Digite o código que deseja atualizar: ");
                cod = scanner.nextInt();
                scanner.nextLine();

                contrato = UserInputHandlerContrato.userInputHandlerContrato(scanner, 1, cod);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    private static void menuProprietario(Scanner scanner) {
        _printOptions();

        int opcao = scanner.nextInt();
        scanner.nextLine();

        int cod = 0;

        switch(opcao){
            case 1:
                System.out.print("Digite o código que deseja consultar: ");
                cod = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println(DbManagerProprietario.find(cod).toString());

                break;
            case 2:
                Proprietario proprietario = UserInputHandlerProprietario.userInputHandlerProprietario(scanner, 0, 0);
                
                DbManagerProprietario.persist(proprietario);
              
                break;
            case 3:
                System.out.print("Digite o código que deseja deletar: ");
                cod = scanner.nextInt();
                scanner.nextLine();
                
                DbManagerProprietario.remove(cod);

                break;
            case 4:
                System.out.print("Digite o código que deseja atualizar: ");
                cod = scanner.nextInt();
                scanner.nextLine();

                proprietario = UserInputHandlerProprietario.userInputHandlerProprietario(scanner, 1, cod);
                
                DbManagerProprietario.merge(proprietario, cod);
               
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    private static void menuCorretor(Scanner scanner) {
        _printOptions();

        int opcao = scanner.nextInt();
        scanner.nextLine();

        int cod = 0;

        switch(opcao){
            case 1:
                System.out.print("Digite o código que deseja consultar: ");
                cod = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println(DbManagerCorretor.find(cod).toString());
                
                break;
            case 2:
                Corretor corretor = UserInputHandlerCorretor.userInputHandlerCorretor(scanner, 0, 0);

                DbManagerCorretor.persist(corretor);
                
                break;
            case 3:
                System.out.print("Digite o código que deseja deletar: ");
                cod = scanner.nextInt();
                scanner.nextLine();

                DbManagerCorretor.remove(cod);
                
                break;
            case 4:
                System.out.print("Digite o código que deseja atualizar: ");
                cod = scanner.nextInt();
                scanner.nextLine();

                corretor = UserInputHandlerCorretor.userInputHandlerCorretor(scanner, 1, cod);
               
                DbManagerCorretor.merge(corretor, cod);
                
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    private static void menuImovel(Scanner scanner) {
        _printOptions();
    	
        int opcao = scanner.nextInt();
        scanner.nextLine();
        
        int cod = 0;
        
        switch(opcao){
	        case 1:
		        System.out.print("Digite o código que deseja consultar: ");
		        cod = scanner.nextInt();
		        scanner.nextLine();
		        
		        System.out.println(DbManagerImovel.find(cod).toString());

		        break;
	        case 2:
	        	Imovel imovel = UserInputHandlerImovel.userInputHandlerImovel(scanner, 0, 0);
       
	        	DbManagerImovel.persist(imovel);
	        	
	        	break;
	        case 3:
	        	System.out.print("Digite o código que deseja deletar: ");
	        	cod = scanner.nextInt();
	        	scanner.nextLine();
	        
	        	DbManagerImovel.remove(cod);
	        	
	        	break;
	        case 4:
	        	System.out.print("Digite o código que deseja atualizar: ");
	        	cod = scanner.nextInt();
	        	scanner.nextLine();
	        	imovel = UserInputHandlerImovel.userInputHandlerImovel(scanner, 1, cod);
	       
	        	DbManagerImovel.merge(imovel, cod);
	        	
	        	break;
	        default:
	        	System.out.println("Opção inválida");
	        	break;
        }
    }
}