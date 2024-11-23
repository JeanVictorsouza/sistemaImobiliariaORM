package br.edu.univas.imobiliaria;
import java.util.Scanner;

import br.edu.univas.imobiliaria.userInputHandler.*;


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

    private static void menuCliente(Scanner scanner) {
        System.out.println("Qual ação deseja realizar: ");
        System.out.println("1 - Leitura");
        System.out.println("2 - Inserção");
        System.out.println("3 - Deletar");
        System.out.println("4 - Atualizar");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        int cod = 0;

        switch (opcao) {
            case 1:
                System.out.print("Digite o código que deseja consultar (Digite -1 caso queira consultar todos os registros do arquivo): ");
                cod = scanner.nextInt();
                scanner.nextLine();
                break;
                
            case 2:
                Cliente cliente = UserInputHandlerCliente.userInputHandlerCliente(scanner, 0, 0);
                
                break;
            case 3:
                System.out.print("Digite o código que deseja deletar (Digite -1 caso queira deletar todos os registros do arquivo): ");
                cod = scanner.nextInt();
                scanner.nextLine();

                break;
            case 4:
                System.out.print("Digite o código que deseja atualizar: ");
                cod = scanner.nextInt();
                scanner.nextLine();

                cliente = UserInputHandlerCliente.userInputHandlerCliente(scanner, 1, cod);
                
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

        private static void menuContrato(Scanner scanner) {
        System.out.println("Qual ação deseja realizar: ");
        System.out.println("1 - Leitura");
        System.out.println("2 - Inserção");
        System.out.println("3 - Deletar");
        System.out.println("4 - Atualizar");

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
        System.out.println("Qual ação deseja realizar: ");
        System.out.println("1 - Leitura");
        System.out.println("2 - Inserção");
        System.out.println("3 - Deletar");
        System.out.println("4 - Atualizar");

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
                Proprietario proprietario = UserInputHandlerProprietario.userInputHandlerProprietario(scanner, 0, 0);
              
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

                proprietario = UserInputHandlerProprietario.userInputHandlerProprietario(scanner, 1, cod);
               
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }

    private static void menuCorretor(Scanner scanner) {
        System.out.println("Qual ação deseja realizar: ");
        System.out.println("1 - Leitura");
        System.out.println("2 - Inserção");
        System.out.println("3 - Deletar");
        System.out.println("4 - Atualizar");

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
                Corretor corretor = UserInputHandlerCorretor.userInputHandlerCorretor(scanner, 0, 0);

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

                corretor = UserInputHandlerCorretor.userInputHandlerCorretor(scanner, 1, cod);
               
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    private static void menuImovel(Scanner scanner) {
        System.out.println("Qual ação deseja realizar: ");
        System.out.println("1 - Leitura");
        System.out.println("2 - Inserção");
        System.out.println("3 - Deletar");
        System.out.println("4 - Atualizar");
        
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
        Imovel imovel = UserInputHandlerImovel.userInputHandlerImovel(scanner, 0, 0);
       
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
        imovel = UserInputHandlerImovel.userInputHandlerImovel(scanner, 1, cod);
       
        break;
        default:
        System.out.println("Opção inválida");
        break;
        }
        }
}