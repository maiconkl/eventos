import java.util.ArrayList;
import java.util.List;
public class Evento {
    String nome;
    String data;
    String local;
    int capacidadeMaxima;
    List<Participante> participantes;
    public Evento(String nome, String data, String local, int capacidadeMaxima) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.capacidadeMaxima = capacidadeMaxima;
        this.participantes = new ArrayList<>();
    }
    public void adicionarParticipante(Participante participante) {
        if (participantes.size() < capacidadeMaxima) {
            participantes.add(participante);
        } else {
            System.out.println("Capacidade máxima atingida!");
        }
    }
    public int getQuantidadeParticipantes() {
        return this.participantes.size();
    }
    public List<Participante> listarParticipantes() {
        return new ArrayList<>(participantes);
    }
    public List<Participante> listarParticipantesVIP() {
        List<Participante> vips = new ArrayList<>();
        for (Participante p : participantes) {
            if (p.getTipo().equalsIgnoreCase("VIP")) {
                vips.add(p);
            }
        }
        return vips;
    }
    public String exibirInfo() {
        return "Evento: " + nome + ", Data: " + data + ", Local: " + local + 
               ", Capacidade: " + capacidadeMaxima;
    }
}