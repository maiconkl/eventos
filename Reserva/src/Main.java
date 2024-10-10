import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> eventos = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Menu de Eventos ===");
            System.out.println("1. Cadastrar Palestra");
            System.out.println("2. Cadastrar Workshop");
            System.out.println("3. Mostrar Eventos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1: 
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
                    String duracaoPalestra = scanner.nextLine();
                    System.out.print("Tema: ");
                    String temaPalestra = scanner.nextLine();

                    
                    System.out.print("Número de participantes da Palestra: ");
                    int numeroParticipantesPalestra = scanner.nextInt();
                    scanner.nextLine(); 
                    List<String> participantesPalestra = new ArrayList<>();
                    for (int i = 0; i < numeroParticipantesPalestra; i++) {
                        System.out.print("Nome do participante " + (i + 1) + ": ");
                        String participante = scanner.nextLine();
                        participantesPalestra.add(participante);
                    }

                    String eventoPalestra = "Palestra: " + nomePalestra + ", Data: " + dataPalestra + ", Local: " + localPalestra +
                            ", Capacidade: " + capacidadePalestra + ", Palestrante: " + palestrante +
                            ", Duração: " + duracaoPalestra + ", Tema: " + temaPalestra + 
                            ", Participantes: " + String.join(", ", participantesPalestra);
                    eventos.add(eventoPalestra);
                    System.out.println("Palestra cadastrada com sucesso!");
                    break;

                case 2:
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

                    
                    System.out.print("Número de participantes do Workshop: ");
                    int numeroParticipantesWorkshop = scanner.nextInt();
                    scanner.nextLine(); 
                    List<String> participantesWorkshop = new ArrayList<>();
                    for (int i = 0; i < numeroParticipantesWorkshop; i++) {
                        System.out.print("Nome do participante " + (i + 1) + ": ");
                        String participante = scanner.nextLine();
                        participantesWorkshop.add(participante);
                    }

                    String eventoWorkshop = "Workshop: " + nomeWorkshop + ", Data: " + dataWorkshop + ", Local: " + localWorkshop +
                            ", Capacidade: " + capacidadeWorkshop + ", Instrutor: " + instrutor +
                            ", Carga Horária: " + cargaHoraria + ", Materiais: " + materiais +
                            ", Participantes: " + String.join(", ", participantesWorkshop);
                    eventos.add(eventoWorkshop);
                    System.out.println("Workshop cadastrado com sucesso!");
                    break;

                case 3: 
                    if (eventos.isEmpty()) {
                        System.out.println("Nenhum evento cadastrado.");
                    } else {
                        System.out.println("\n=== Lista de Eventos ===");
                        for (String evento : eventos) {
                            System.out.println(evento);
                        }
                    }
                    break;

                case 4: 
                    System.out.println("Saindo!");
                    scanner.close(); 
                    return; 

                default: 
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
