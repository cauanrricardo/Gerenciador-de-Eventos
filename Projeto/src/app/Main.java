package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadordeEventos gerenciador = new GerenciadordeEventos();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        while (true) {
            System.out.println("\n=== Menu de Eventos ===");
            System.out.println("1. Adicionar Evento");
            System.out.println("2. Listar Eventos");
            System.out.println("3. Buscar Evento por ID");
            System.out.println("4. Atualizar Evento");
            System.out.println("5. Remover Evento");
            System.out.println("6. Listar Eventos Ativos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = sc.nextInt();
            sc.nextLine();
            
            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome do Evento: ");
                    String nome = sc.nextLine();
                    System.out.print("Local: ");
                    String local = sc.nextLine();
                    System.out.print("Data e Hora (yyyy-MM-dd HH:mm): ");
                    LocalDateTime dataHora = LocalDateTime.parse(sc.nextLine(), formatter);
                    
                    Evento novoEvento = new Evento(id, nome, local, true, dataHora);
                    gerenciador.adicionarEvento(novoEvento);
                    System.out.println("Evento adicionado com sucesso!");
                    break;
                
                case 2:
                    System.out.println("\n=== Lista de Eventos ===");
                    gerenciador.listarEventos();
                    break;
                
                case 3:
                    System.out.print("Digite o ID do evento: ");
                    int idBusca = sc.nextInt();
                    Evento encontrado = gerenciador.buscarEvento(idBusca);
                    System.out.println(encontrado != null ? encontrado : "Evento não encontrado.");
                    break;
                
                case 4:
                    System.out.print("Digite o ID do evento para atualizar: ");
                    int idAtualizar = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = sc.nextLine();
                    System.out.print("Novo local: ");
                    String novoLocal = sc.nextLine();
                    System.out.print("Nova data e hora (yyyy-MM-dd HH:mm): ");
                    LocalDateTime novaData = LocalDateTime.parse(sc.nextLine(), formatter);
                    gerenciador.atualizarEvento(idAtualizar, novoNome, novaData, novoLocal);
                    System.out.println("Evento atualizado!");
                    break;
                
                case 5:
                    System.out.print("Digite o ID do evento para remover: ");
                    int idRemover = sc.nextInt();
                    gerenciador.removerEvento(idRemover);
                    System.out.println("Evento removido!");
                    break;
                
                case 6:
                    System.out.println("\n=== Eventos Ativos ===");
                    gerenciador.listarEventosAtivos();
                    break;
                
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
        sc.close();
    }
}
