import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Evento> eventos = new ArrayList<>();
        while (true) {
            System.out.println("\n=== Menu de Eventos ===");
            System.out.println("1. Cadastrar Palestra");
            System.out.println("2. Cadastrar Workshop");
            System.out.println("3. Exibir relatório de eventos");
            System.out.println("4. Listar participantes de um evento");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            switch (opcao) {
                case 1:
                    // Cadastrar Palestra
                    System.out.print("Nome da Palestra: ");
                    String nomePalestra = scanner.nextLine();
                    System.out.print("Data (YYYY-MM-DD): ");
                    String dataPalestra = scanner.nextLine();
                    System.out.print("Local: ");
                    String localPalestra = scanner.nextLine();
                    System.out.print("Capacidade Máxima: ");
                    int capacidadePalestra = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Palestrante: ");
                    String palestrante = scanner.nextLine();
                    System.out.print("Duração: ");
                    String duracao = scanner.nextLine();
                    System.out.print("Tema: ");
                    String tema = scanner.nextLine();
                    Palestra palestra = new Palestra(nomePalestra, dataPalestra, localPalestra, capacidadePalestra, palestrante, duracao, tema);
                    // Adicionar Participantes
                    System.out.print("Número de participantes: ");
                    int numParticipantes = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < numParticipantes; i++) {
                        System.out.print("Nome do Participante " + (i + 1) + ": ");
                        String nomeParticipante = scanner.nextLine();
                        System.out.print("E-mail do Participante " + (i + 1) + ": ");
                        String emailParticipante = scanner.nextLine();
                        System.out.print("Tipo (normal ou VIP): ");
                        String tipoParticipante = scanner.nextLine();
                        Participante participante = new Participante(nomeParticipante, emailParticipante, tipoParticipante);
                        palestra.adicionarParticipante(participante);
                    }
                    eventos.add(palestra);
                    System.out.println("Palestra cadastrada com sucesso!");
                    break;
                case 2:
                    // Cadastrar Workshop
                    System.out.print("Nome do Workshop: ");
                    String nomeWorkshop = scanner.nextLine();
                    System.out.print("Data (YYYY-MM-DD): ");
                    String dataWorkshop = scanner.nextLine();
                    System.out.print("Local: ");
                    String localWorkshop = scanner.nextLine();
                    System.out.print("Capacidade Máxima: ");
                    int capacidadeWorkshop = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Instrutor: ");
                    String instrutor = scanner.nextLine();
                    System.out.print("Carga Horária: ");
                    String cargaHoraria = scanner.nextLine();
                    System.out.print("Materiais Necessários: ");
                    String materiais = scanner.nextLine();
                    Workshop workshop = new Workshop(nomeWorkshop, dataWorkshop, localWorkshop, capacidadeWorkshop, instrutor, cargaHoraria, materiais);
                    // Adicionar Participantes
                    System.out.print("Número de participantes: ");
                    numParticipantes = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < numParticipantes; i++) {
                        System.out.print("Nome do Participante " + (i + 1) + ": ");
                        String nomeParticipante = scanner.nextLine();
                        System.out.print("E-mail do Participante " + (i + 1) + ": ");
                        String emailParticipante = scanner.nextLine();
                        System.out.print("Tipo (normal ou VIP): ");
                        String tipoParticipante = scanner.nextLine();
                        Participante participante = new Participante(nomeParticipante, emailParticipante, tipoParticipante);
                        workshop.adicionarParticipante(participante);
                    }
                    eventos.add(workshop);
                    System.out.println("Workshop cadastrado com sucesso!");
                    break;
                case 3:
                   if(eventos.isEmpty()){
                        System.out.println("Nenhum evento cadastrado!");
                   } else {
                        System.out.println("\n=== Relatório de eventos ===");
                        for (Evento evento : eventos) {
                            System.out.println(evento.exibirInfo());
                            System.out.println("Quantidade de participantes: " + evento.getQuantidadeParticipantes());
                        }
                   }
                   break;
                
                case 4:
                   // listar participantes VIPs de um evento
                    if(eventos.isEmpty()) {
                        System.out.println("Nenhum evento cadastrado!");
                    } else {
                        System.out.println("Digite o nome do evento: ");
                        String nomeEvento = scanner.nextLine();
                        Evento eventoEncontrado = null;
                        for(Evento evento : eventos) {
                            if (evento.nome.equalsIgnoreCase(nomeEvento)){
                                eventoEncontrado = evento;
                                break;
                            }
                        }
                        if (eventoEncontrado != null){
                            System.out.println("Participantes do evento " + nomeEvento + ": ");
                            List<Participante> participantes = eventoEncontrado.listarParticipantes();
                            List<Participante> participantesVIP = eventoEncontrado.listarParticipantesVIP();
                            System.out.print("Participantes: ");
                            // exibindo todos os participantes
                            if(participantes.isEmpty()) {
                                System.out.println("Nenhum Participante.");
                            } else {
                                for (Participante p : participantes) {
                                    System.out.println(p.getNome() + ", ");
                                }
                                System.out.println();
                            }
                            // exibindo os VIPs
                            System.out.println("Participantes VIPs: ");
                            if (participantesVIP.isEmpty()) {
                                System.out.println("Nenhum VIP.");
                            } else {
                                for (Participante p : participantesVIP){
                                    System.out.println(p.getNome() + ", ");
                                }
                                System.out.println();
                            }
                        } else {
                            System.out.println("Evento não encontrado.");
                        }
                    }
                    break;
                case 5:
                   scanner.close();
                   return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}