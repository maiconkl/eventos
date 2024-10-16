import java.util.ArrayList;
import java.util.List;
public class Workshop extends Evento {
    private String instrutor;
    private String cargaHoraria;
    private String materiaisNecessarios;
    private List<Participante> participantes;
    public Workshop(String nome, String data, String local, int capacidadeMaxima, 
                    String instrutor, String cargaHoraria, String materiaisNecessarios) {
        super(nome, data, local, capacidadeMaxima);
        this.instrutor = instrutor;
        this.cargaHoraria = cargaHoraria;
        this.materiaisNecessarios = materiaisNecessarios;
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
    public String exibirInfo() {
        String info = "Workshop: " + nome + ", Data: " + data + ", Local: " + local +
               ", Capacidade: " + capacidadeMaxima + ", Instrutor: " + instrutor +
               ", Carga Horária: " + cargaHoraria + ", Materiais: " + materiaisNecessarios;
        return info;
    }
}