import java.util.ArrayList;
import java.util.List;

public class Evento {
    String nome;
    String data;
    String local;
    int capacidadeMaxima;
    List<String> participantes;

    public Evento(String nome, String data, String local, int capacidadeMaxima) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.capacidadeMaxima = capacidadeMaxima;
        this.participantes = new ArrayList<>();
    }

    public void adicionarParticipante(String participante) {
        if (participantes.size() < capacidadeMaxima) {
            participantes.add(participante);
        } else {
            System.out.println("Capacidade máxima atingida!");
        }
    }

    public String exibirInfo() {
        return "Evento: " + nome + ", Data: " + data + ", Local: " + local + 
               ", Capacidade: " + capacidadeMaxima + ", Participantes: " + participantes;
    }
}
