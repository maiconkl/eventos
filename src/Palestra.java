import java.util.ArrayList;
import java.util.List;

public class Palestra extends Evento {
    private String palestrante;
    private String duracao;
    private String tema;
    private List<Participante> participantes;

    public Palestra(String nome, String data, String local, int capacidadeMaxima, 
                    String palestrante, String duracao, String tema) {
        super(nome, data, local, capacidadeMaxima);
        this.palestrante = palestrante;
        this.duracao = duracao;
        this.tema = tema;
        this.participantes = new ArrayList<>();
    }

    public void adicionarParticipante(Participante participante) {
        if (participantes.size() < capacidadeMaxima) {
            participantes.add(participante);
        } else {
            System.out.println("Capacidade máxima atingida!");
        }
    }

    @Override
<<<<<<< HEAD
=======
    public List<Participante> listarParticipantesVIP() {
        List<Participante> vips = new ArrayList<>();
        for (Participante p : participantes) {
            if (p.getTipo().equalsIgnoreCase("VIP")) {
                vips.add(p);
            }
        }
        return vips;
    }

    @Override
>>>>>>> ffd9c4cbb692574e0c9786fa2621016d98cee9ec
    public String exibirInfo() {
        String info = "Palestra: " + nome + ", Data: " + data + ", Local: " + local +
               ", Capacidade: " + capacidadeMaxima + ", Palestrante: " + palestrante +
               ", Duração: " + duracao + ", Tema: " + tema;
<<<<<<< HEAD
        info += "\nParticipantes:";
        for (Participante p : participantes) {
            info += "\n" + p.toString();
        }
=======
>>>>>>> ffd9c4cbb692574e0c9786fa2621016d98cee9ec
        return info;
    }
}
